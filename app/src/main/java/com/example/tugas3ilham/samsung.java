package com.example.tugas3ilham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class samsung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsung);

        Button sharebtn = findViewById(R.id.btn);
        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sbuild = new StringBuilder();


                Intent shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("image/png");

                String title = " ";
                String desc = " ";
                String cost = " ";

                sbuild.append("Nama Barang : SAMSUNG").append(title).append("\n");
                sbuild.append("Detail barang : processor_cpu_speed_3_36ghz_2_8ghz_2ghz_cpu_type_octa_core_display_size_main_display_153_9mm_6_1full_rectangle_149_9mm_5_9_rounded_corners_resolution_main_display_2340_x_1080_fhd_technology_main_display_dynamic_amoled_2x_color_depth_main_display_16m_max_refresh_rate_main_display_120_hz").append(desc).append("\n");
                sbuild.append("Harga Barang : 25.000.000").append(cost).append("\n");

                String detailbrg = sbuild.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detailbrg);

                startActivity(Intent.createChooser(shareintent, "Share"));

            }

        });
    }

}