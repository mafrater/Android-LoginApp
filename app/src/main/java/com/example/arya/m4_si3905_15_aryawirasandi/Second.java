package com.example.arya.m4_si3905_15_aryawirasandi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    Button btnKeluar;
    TextView Nama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        btnKeluar = (Button)findViewById(R.id.keluar);
        Nama = (TextView)findViewById(R.id.nama);
        Intent i = getIntent();
        String userPop = i.getStringExtra("username");
                Nama.setText(userPop);
        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
