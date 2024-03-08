package com.example.tugas3ilham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hsnokia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hsnokia);

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

                sbuild.append("Nama Barang : EARPHONE NOKIA").append(title).append("\n");
                sbuild.append("Detail barang : nokia_e3100_plus_merupakan_earphone_wireless_dengan_desain_in_ear_yang_ergonomis_dan_dapat_diatur_sesuai_dengan_ukuran_telinga_pengguna_earphone_ini_menggunakan_driver_6mm_dengan_teknologi_noise_cancelling_pasif_yang_dapat_menghasilkan_suara_jernih_dan_minim_kebisingan").append(desc).append("\n");
                sbuild.append("Harga Barang : 250.000").append(cost).append("\n");

                String detailbrg = sbuild.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detailbrg);

                startActivity(Intent.createChooser(shareintent, "Share"));

            }
        });
    }
}