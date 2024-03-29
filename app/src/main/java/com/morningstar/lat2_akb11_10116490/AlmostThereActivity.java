package com.morningstar.lat2_akb11_10116490;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/*
 * Created Bye
 *
 * NIM     : 10116490
 * Nama    : Muhammad Fajar Maulana
 * Kelas   : IF-11 / AKB-11
 * Tanggal : 18-April-2019
 *
 * */
public class AlmostThereActivity extends AppCompatActivity {

    private Button btnVerifikasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);

        //Pengaturan FULLSCREEN
        View overlay = findViewById(R.id.almost);

        overlay.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_FULLSCREEN);

        btnVerifikasi = (Button) findViewById(R.id.btn_Verify);
        btnVerifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(AlmostThereActivity.this, VerifiyActivity.class);
                startActivity(moveIntent);
            }
        });
    }
}
