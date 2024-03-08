package com.example.tugas3ilham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class asus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asus);


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

                sbuild.append("Nama Barang : ASUS").append(title).append("\n");
                sbuild.append("Detail barang : platform_os_android_9_0_pie_rog_ui_chipset_qualcomm_sm8150_snapdragon_855_7_nm_cpu_octa_core_1x2_96_ghz_kryo_485_3x2_42_ghz_kryo_485_4x1_78_ghz_kryo_485_gpu_adreno_640_700_mhz_memory_card_slot_no_internal_128gb_8gb_ram_256gb_12gb_ram_512gb_12gb_ram_1tb_12gb_ram_ufs_3_0").append(desc).append("\n");
                sbuild.append("Harga Barang : 30.000.000,00").append(cost).append("\n");

                String detailbrg = sbuild.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detailbrg);

                startActivity(Intent.createChooser(shareintent, "Share"));

            }

        });
    }
}