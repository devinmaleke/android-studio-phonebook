package com.example.uas;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder>{

    ArrayList<Dataset> data = new ArrayList<>();

    public Adapter(ArrayList<Dataset> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_adapter,parent,false);
        viewHolder holder = new viewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {


        Glide.with(holder.imageView).load(data.get(position).getPicture().getMedium()).into(holder.imageView);
        holder.nama_.setText(data.get(position).getName().getFirst()+" "+data.get(position).getName().getLast());
        holder.city_.setText("City: " + data.get(position).getLocation().getCity()+", "+data.get(position).getLocation().getCountry());
        holder.phone_.setText("Phone: "+data.get(position).getCell()+" / " + data.get(position).getPhone());
        holder.member_.setText("Member Since: "+data.get(position).getRegistered().getDate());

        holder.linlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity2.class);
                intent.putExtra("data", data.get(position));
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView nama_;
        TextView city_;
        TextView phone_;
        TextView member_;
        LinearLayout linlay;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            nama_ = itemView.findViewById(R.id.textViewNama);
            city_ = itemView.findViewById(R.id.textViewCity);
            phone_ = itemView.findViewById(R.id.textViewPhone);
            member_ = itemView.findViewById(R.id.textViewDate);
            linlay = itemView.findViewById(R.id.LinLay);

        }
    }
}
