package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_about extends AppCompatActivity {

    private Button buttontwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        buttontwo = (Button) findViewById(R.id.buttontwo);

        buttontwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_main();
            }
        });
    }
    public void openActivity_main(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}