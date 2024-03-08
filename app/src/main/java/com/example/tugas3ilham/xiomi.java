package com.example.tugas3ilham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class xiomi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiomi);

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

                sbuild.append("Nama Barang : XIOMI").append(title).append("\n");
                sbuild.append("Detail barang : network_technology_gsm_hspa_lte_launch_announced_2018_february_14_status_available_released_2018_february_body_dimensions_158_6_x_75_4_x_8_1_mm_6_24_x_2_97_x_0_32_in_weight_181_g_6_38_oz_build_glass_front_gorilla_glass_aluminum_back_aluminum_frame").append(desc).append("\n");
                sbuild.append("Harga Barang : 4.000.000,00").append(cost).append("\n");

                String detailbrg = sbuild.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detailbrg);

                startActivity(Intent.createChooser(shareintent, "Share"));

            }

        });
    }
}