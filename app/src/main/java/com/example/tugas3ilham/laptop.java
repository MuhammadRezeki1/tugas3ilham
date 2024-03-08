package com.example.tugas3ilham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class laptop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop);

        ImageView imgv = findViewById(R.id.imglapasus);

        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentip = new Intent(laptop.this, lapasus.class);
                startActivity(intentip);
            }
        });

        ImageView imglapxio = findViewById(R.id.imglapxio);

        imglapxio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentip = new Intent(laptop.this, lapxio.class);
                startActivity(intentip);
            }
        });


        ImageView imglaphp = findViewById(R.id.imglaphp);

            imglaphp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentip = new Intent(laptop.this, laphp.class);
                startActivity(intentip);
            }
        });

        ImageView imglapacer = findViewById(R.id.imglapacer);

        imglapacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentip = new Intent(laptop.this, lapacer.class);
                startActivity(intentip);
            }
        });

        ImageView imgmsi = findViewById(R.id.imgmsi);

        imgmsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentip = new Intent(laptop.this, msi.class);
                startActivity(intentip);
            }
        });

    }
}