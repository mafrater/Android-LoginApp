package com.example.arya.m4_si3905_15_aryawirasandi;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class masuk extends AppCompatActivity {
    EditText userName, password;
    Button btnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.masuk);

//       get id username and password
        userName = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        btnlogin = (Button) findViewById(R.id.btnLogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userNameKey = userName.getText().toString();
                String passwordKey = password.getText().toString();
                if (userNameKey.equals("admin") && passwordKey.equals("123")) {
                    // masuk success
                    Toast.makeText(getApplicationContext(), "masuk Sukses", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(masuk.this, Second.class);
                    masuk.this.startActivity(intent);
                } else if (userNameKey.equals("1202150077") && passwordKey.equals("15")) {
                    // masuk success
                    Toast.makeText(getApplicationContext(), "masuk Sukses", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(masuk.this, Second.class);
                    intent.putExtra("username", userNameKey);
                    masuk.this.startActivity(intent);

                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(masuk.this);
                    builder.setMessage("Username dan Password salah")
                            .setNegativeButton("Retry....", null).create().show();
                }
            }
        });
    }}
