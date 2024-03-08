package com.example.tugas3ilham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ip);

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

                sbuild.append("Nama Barang : IPHONE12").append(title).append("\n");
                sbuild.append("Detail barang : Kinerja Chipset Apple A14 Bionic yang Bertenaga Punya Sensor UWB Kualitas Layar dengan Resolusi Tajam Hasil Fotografi Memukau Hadir dengan Konektivitas MagSafe untuk Wireless Charging yang Lebih Cepat dan Mendukung Ekosistem Aksesoris").append(desc).append("\n");
                sbuild.append("Harga Barang : 20.000.000").append(cost).append("\n");

                String detailbrg = sbuild.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detailbrg);

                startActivity(Intent.createChooser(shareintent, "Share"));

            }
        });
    }
}