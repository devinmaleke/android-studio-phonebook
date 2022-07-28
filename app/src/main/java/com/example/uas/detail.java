package com.example.uas;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import retrofit.Sambung;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class detail extends Fragment {

    ArrayList<Dataset> data;
    private final String TAG = "MainActivity";
    RecyclerView recyclerView;
    Adapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        recyclerView = view.findViewById(R.id.recycleView);
        RecyclerView.LayoutManager rv = new LinearLayoutManager(getContext());

        recyclerView.setLayoutManager(rv);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://u73olh7vwg.execute-api.ap-northeast-2.amazonaws.com/stage2/people/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Sambung sambung = retrofit.create(Sambung.class);
        Call<Employees> get = sambung.getdataset();
        get.enqueue(new Callback<Employees>() {
            @Override
            public void onResponse(Call<Employees> call, Response<Employees> response) {

                if(response.isSuccessful()) {
                    data = response.body().getEmployees();
                    Log.d(TAG, data.get(0).toString());
                    adapter = new Adapter(data);

                    recyclerView.setAdapter(adapter);
                }
                else{
                    Log.d(TAG, "Failed");
                }
            }

            @Override
            public void onFailure(Call<Employees> call, Throwable t) {
                Log.d(TAG, t.toString());
            }
        });
        return view;
    }
}