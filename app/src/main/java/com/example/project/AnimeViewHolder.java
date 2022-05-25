package com.example.project;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

public class AnimeViewHolder extends RecyclerView.ViewHolder {
    public TextView name;

    public AnimeViewHolder(@NonNull View itemView){
        super(itemView);
        name = itemView.findViewById(R.id.name);
    }
}
