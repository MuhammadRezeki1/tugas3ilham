package com.example.tugas3ilham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class msi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msi);

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

                sbuild.append("Nama Barang : LAPTOP MSI").append(title).append("\n");
                sbuild.append("Detail barang : prosesor_intel_core_i5_1155g7_4_core_clock_up_to_4_5_ghz_grafis_integrated_intel_iris_xe_vga_no_ram_8gb_ddr4_storage_ssd_512_gb_nvme_pcie_gen3x4_layar_ips_level_14_inci_full_hd_1920_x_1080_piksel_keyboard_backlight_keyboard").append(desc).append("\n");
                sbuild.append("Harga Barang : 15.000.000").append(cost).append("\n");

                String detailbrg = sbuild.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detailbrg);

                startActivity(Intent.createChooser(shareintent, "Share"));

            }
        });
    }
}