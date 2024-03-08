package com.example.tugas3ilham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lapxio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lapxio);

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

                sbuild.append("Nama Barang : LAPTOP XIOMI").append(title).append("\n");
                sbuild.append("Detail barang : layar_tipe_layar_15_6_fhd_resolusi_1920_x_1080_ppi_141_kontrol_kecerahan_peredupan_dc_kecerahan_220_nit_umum_rasio_kontras_500_1_gamut_warna_ntsc_45_umum_sudut_tampilan_90_h_sistem_operasi_windows_10_home_prosesor_11th_generation_intel_core_i3_1115g4_up_to_4_1_ghz_2_cores_4_threads_6_mb_cache_11th_generation_intel_core_i5_11300h").append(desc).append("\n");
                sbuild.append("Harga Barang : 12.000.000").append(cost).append("\n");

                String detailbrg = sbuild.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detailbrg);

                startActivity(Intent.createChooser(shareintent, "Share"));

            }
        });
    }
}