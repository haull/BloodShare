package com.example.a10119244latihan2;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/* Tanggal Pengerjaan : 24 April 2022
 * NIM                 : 10119244
 * Nama                : Mya Hauliyah
 * Kelas               : IF-6
 */

public class AlmostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);
    }

    public void sendVerificationCode(View view) {
        Intent intent = new Intent(this, VerifyActivity.class);
        startActivity(intent);
    }
}
