package com.example.tugas3ilham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hsair extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hsair);

        Button share = findViewById(R.id.btn);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sbuild = new StringBuilder();

                Intent shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("image/*");
                String title = " ";
                String desc = " ";
                String cost = " ";

                sbuild.append("Nama Barang : AIRPODS").append(title).append("\n");
                sbuild.append("Detail barang : sensor_mikrofon_ganda_pembentuk_sinyal_sensor_optik_ganda_akselerometer_pendeteksi_gerak_akselerometer_pendeteksi_bicara_chip_chip_headphone_h1_kontrol_ketuk_dua_kali_untuk_memutar_melompat_maju_atau_menjawab_panggilan_telepon").append(desc).append("\n");
                sbuild.append("Harga Barang : 2.000.000").append(cost).append("\n");

                String detailbrg = sbuild.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detailbrg);

                startActivity(Intent.createChooser(shareintent, "Share"));

            }
        });

    }
}