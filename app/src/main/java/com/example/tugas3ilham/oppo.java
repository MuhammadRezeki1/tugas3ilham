package com.example.tugas3ilham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class oppo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oppo);

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

                sbuild.append("Nama Barang : OPPO").append(title).append("\n");
                sbuild.append("Detail barang : platform_os_android_8_1_oreo_coloros_5_1_chipset_qualcomm_sdm450_snapdragon_450_14_nm_cpu_octa_core_1_8_ghz_cortex_a53_gpu_adreno_506_memory_card_slot_microsdxc_dedicated_slot_internal_16gb_2gb_ram_32gb_3gb_ram_64gb_4gb_ram_emmc_5_1").append(desc).append("\n");
                sbuild.append("Harga Barang : 2.000.000,00").append(cost).append("\n");

                String detailbrg = sbuild.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detailbrg);

                startActivity(Intent.createChooser(shareintent, "Share"));

            }

        });
    }
}