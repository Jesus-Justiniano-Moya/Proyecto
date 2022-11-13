package com.example.headbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.LoginFilter;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button logBTN, RegistrarBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logBTN = findViewById(R.id.LogBTN);
        RegistrarBTN = findViewById(R.id.RegistrarBTN);

        logBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Login.class));
            }
        });

        RegistrarBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Registro.class));
            }
        });
    }
}