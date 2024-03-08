package com.example.tugas3ilham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hp);

        ImageView imgv = findViewById(R.id.imgip);

        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentip = new Intent(hp.this, ip.class);
                startActivity(intentip);
            }
        });

        ImageView imgsam = findViewById(R.id.imgsam);

        imgsam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentip = new Intent(hp.this, samsung.class);
                startActivity(intentip);
            }
        });

        ImageView imgxio = findViewById(R.id.imgxiomi);

        imgxio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentip = new Intent(hp.this, xiomi.class);
                startActivity(intentip);
            }
        });


        ImageView imgopo = findViewById(R.id.imgopo);

        imgopo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentip = new Intent(hp.this, oppo.class);
                startActivity(intentip);
            }
        });

        ImageView imgasus = findViewById(R.id.imgasus);

        imgasus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentip = new Intent(hp.this, asus.class);
                startActivity(intentip);
            }
        });
    }
}