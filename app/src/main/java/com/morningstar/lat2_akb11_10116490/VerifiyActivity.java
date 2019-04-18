package com.morningstar.lat2_akb11_10116490;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
 * Created Bye
 *
 * NIM     : 10116490
 * Nama    : Muhammad Fajar Maulana
 * Kelas   : IF-11 / AKB-11
 * Tanggal : 18-April-2019
 *
 * */
public class VerifiyActivity extends AppCompatActivity {

    private Button btnKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifiy);
        TextView textResend = (TextView) findViewById(R.id.txt_Resend);

        //Pengaturan FULLSCREEN
        View overlay = findViewById(R.id.verifikasi);

        overlay.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_FULLSCREEN);

        Spanned html = Html.fromHtml(
                "doesn't get the code? <b>Resend</b>"
        );

        // Set TextView text from html
        textResend.setText(html);

        btnKirim = (Button) findViewById(R.id.btn_Send);
        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(VerifiyActivity.this, UserHomeActivity.class);
                startActivity(moveIntent);
            }
        });
    }
}
