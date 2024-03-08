package com.example.tugas3ilham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hsoppo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hsoppo);

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

                sbuild.append("Nama Barang : EARPHONE OPPO").append(title).append("\n");
                sbuild.append("Detail barang : Enco Buds 24 Jam Daya Tahan Baterai Pengurangan Noise Panggilan Cerdas Koneksi Otomatis Terbuka Mode Game Latensi Rendah").append(desc).append("\n");
                sbuild.append("Harga Barang : 300.000").append(cost).append("\n");

                String detailbrg = sbuild.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detailbrg);

                startActivity(Intent.createChooser(shareintent, "Share"));

            }
        });
    }
}