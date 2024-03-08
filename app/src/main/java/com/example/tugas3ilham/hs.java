package com.example.tugas3ilham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hs);

        ImageView imgopo = findViewById(R.id.hsopo);

        imgopo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentip = new Intent(hs.this, hsoppo.class);
                startActivity(intentip);
            }
        });

        ImageView imgxio = findViewById(R.id.hsxio);

        imgxio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentip = new Intent(hs.this, hsxio.class);
                startActivity(intentip);
            }
        });

        ImageView imgrealme = findViewById(R.id.hsrealme);

        imgrealme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentip = new Intent(hs.this, hsrealme.class);
                startActivity(intentip);
            }
        });

        ImageView imgirpod = findViewById(R.id.airpod);

        imgirpod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentip = new Intent(hs.this, hsair.class);
                startActivity(intentip);
            }
        });

        ImageView imgnokia = findViewById(R.id.nokia);

        imgnokia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentip = new Intent(hs.this, hsnokia.class);
                startActivity(intentip);
            }
        });



    }
}