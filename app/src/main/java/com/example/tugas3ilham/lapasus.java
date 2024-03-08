package com.example.tugas3ilham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lapasus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lapasus);

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

                sbuild.append("Nama Barang : LAPTOP ASUS").append(title).append("\n");
                sbuild.append("Detail barang : e210ma_color_peacock_blue_dreamy_white_rose_pink_operating_system_windows_10_home_asus_recommends_windows_10_pro_for_business_windows_11_home_asus_recommends_windows_11_pro_for_business_free_upgrade_to_windows_11").append(desc).append("\n");
                sbuild.append("Harga Barang : 10.000.000").append(cost).append("\n");

                String detailbrg = sbuild.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detailbrg);

                startActivity(Intent.createChooser(shareintent, "Share"));

            }
        });


    }
}