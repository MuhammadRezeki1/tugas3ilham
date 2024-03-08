package com.example.tugas3ilham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lapacer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lapacer);

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

                sbuild.append("Nama Barang : LAPTOP ACER").append(title).append("\n");
                sbuild.append("Detail barang : ukuran_layar_35_6cm_14_39_6cm_15_6_total_memori_sistem_terpasang_4gb_8gb_16gb_model_pengontrol_grafik_geforce_rtx_2050_geforce_mx350_geforce_mx550_iris_xe_graphics_uhd_graphics_kapasitas_total_solid_state_drive_256gb_512gb").append(desc).append("\n");
                sbuild.append("Harga Barang : 10.000.000").append(cost).append("\n");

                String detailbrg = sbuild.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detailbrg);

                startActivity(Intent.createChooser(shareintent, "Share"));

            }
        });
    }
}