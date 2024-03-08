package com.example.tugas3ilham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView imghp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imghp = findViewById(R.id.tvhp);

        imghp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentimg = new Intent(MainActivity.this, hp.class);
                startActivity(intentimg);
            }
        });

        ImageView imglap = findViewById(R.id.tvlaptop);

        imglap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentlap = new Intent(MainActivity.this, laptop.class);
                startActivity(intentlap);
            }
        });

        ImageView imghs = findViewById(R.id.headset);

    imghs.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intenths = new Intent(MainActivity.this, hs.class);
            startActivity(intenths);
        }
    });
    }
}