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

import android.widget.Button;


public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    public void submitCode(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
