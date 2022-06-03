package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.AnimeViewHolder>  {
    private ArrayList<Anime> as; //anime_series

    public RecyclerViewAdapter(ArrayList<Anime> as) {
        this.as = as;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.AnimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.anime_list, parent, false);
        return new AnimeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewAdapter.AnimeViewHolder holder, int position) {
        String name = as.get(position).getName();
        Integer company = as.get(position).getCompany();
        holder.name.setText(name);
        holder.company.setText(company.toString());
    }

    @Override
    public int getItemCount() {
        return as.size();
    }

    public class AnimeViewHolder extends RecyclerView.ViewHolder {

        private TextView name, company;

        public AnimeViewHolder(final View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.Name);
            company = itemView.findViewById(R.id.company);
        }

    }
}