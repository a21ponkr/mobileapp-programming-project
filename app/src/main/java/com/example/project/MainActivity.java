package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    RecyclerView recyclerView;
    private Button aboutButton;

    private final String Tag = "==>";
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=a21ponkr";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        new JsonTask(this).execute(JSON_URL);

        recyclerView =findViewById(R.id.recyclerview);
        recyclerView.setAdapter(new AnimeAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        aboutButton = findViewById(R.id.aboutbutton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "about button clicked");
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public void onPostExecute(String json) {
        Log.d("==>", json);
        Gson gson = new Gson();
        Type type = new TypeToken<List<Anime>>() {}.getType();
        List<Anime> listOfAnime = gson.fromJson(json, type);
        Log.d("==>","Anime amount: "+listOfAnime.size());
        Log.d("==>","Element 0 "+listOfAnime.get(0).toString());

    }
}