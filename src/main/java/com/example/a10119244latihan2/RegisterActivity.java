package com.example.a10119244latihan2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/* Tanggal Pengerjaan : 24 April 2022
 * NIM                 : 10119244
 * Nama                : Mya Hauliyah
 * Kelas               : IF-6
 */

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setBackground(ContextCompat.getDrawable(this, R.drawable.ic_header));

        setSupportActionBar(toolbar);

        setSpinner(findViewById(R.id.fieldBloodType), R.array.blood_type);
        setSpinner(findViewById(R.id.fieldReshus), R.array.reshus);
        setSpinner(findViewById(R.id.fieldJob), R.array.jobs);
    }

    public void register(View view) {
        Intent intent = new Intent(this, AlmostActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    private void setSpinner(Spinner spinner, int resource) {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                resource, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
