package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeViewHolder>{
    List<String> animeSeries = Arrays.asList("Welcome to the NHK!", "Tekkon Kinkreet","BECK: Mongolian Chop Squad","Steins;Gate","Sonny Boy");

    @NonNull
    @Override
    public AnimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_anime, parent, false);
        return new AnimeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeViewHolder holder, int position){
        holder.name.setText(animeSeries.get(position));
    }

    @Override
    public int getItemCount(){
        return animeSeries.size();
    }

}
