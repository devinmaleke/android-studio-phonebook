package com.example.uas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity2 extends FragmentActivity implements OnMapReadyCallback {
    Dataset data;
    TextView nama,city,phone,date,email;
    GoogleMap gmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        get();

        SupportMapFragment map = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.gmap);
        map.getMapAsync(this);

        nama = findViewById(R.id.nama);
        nama.setText(data.getName().getFirst() + " " + data.getName().getLast());

        city = findViewById(R.id.city);
        city.setText(data.getLocation().getCity()+", "+data.getLocation().getCountry());

        phone = findViewById(R.id.phone);
        phone.setText(data.getCell()+" / " + data.getPhone());

        date = findViewById(R.id.date);
        date.setText(data.getRegistered().getDate());

        email = findViewById(R.id.email);
        email.setText(data.getEmail());







    }

    public void get(){
        Intent intent = getIntent();
        if(intent.getExtras()!=null){
            data = (Dataset) intent.getSerializableExtra("data");
        }
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        gmap = googleMap;

        LatLng latLng = new LatLng(Double.parseDouble(data.getLocation().getCoordinates().getLatitude()), Double.parseDouble(data.getLocation().getCoordinates().getLongitude()));
        gmap.addMarker(new MarkerOptions().position(latLng).title(data.getLocation().getState()));
        gmap.moveCamera(CameraUpdateFactory.newLatLng(latLng));


    }
}