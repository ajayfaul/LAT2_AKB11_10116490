package com.morningstar.lat2_akb11_10116490;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
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
public class RegisterActivity extends AppCompatActivity {

    private Button btnregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        View overlay = findViewById(R.id.reggister);

        overlay.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_FULLSCREEN);


        btnregister = (Button) findViewById(R.id.btn_Register);
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(RegisterActivity.this, AlmostThereActivity.class);
                startActivity(moveIntent);
            }
        });
    }


}
