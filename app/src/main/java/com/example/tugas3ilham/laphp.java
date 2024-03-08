package com.example.tugas3ilham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class laphp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laphp);

        Button share = findViewById(R.id.btn);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sbuild = new StringBuilder();

                Intent shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("image/png");
                String title = " ";
                String desc = " ";
                String cost = " ";

                sbuild.append("Nama Barang : LAPTOP HP").append(title).append("\n");
                sbuild.append("Detail barang : amd_ryzen_5_processorwindows_11_home_single_language_hp_recommends_windows_11_pro_for_business14_hd_displayamd_radeon_graphics8_gb_ddr4_3200_ram512_gb_ssd_hard_drivebacklit_keyboard_hp_wolf_security").append(desc).append("\n");
                sbuild.append("Harga Barang : 7.000.000").append(cost).append("\n");

                String detailbrg = sbuild.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detailbrg);

                startActivity(Intent.createChooser(shareintent, "Share"));

            }
        });
    }
}