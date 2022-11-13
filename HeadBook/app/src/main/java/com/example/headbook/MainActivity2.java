package com.example.headbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txtDatos;
    Button btnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnv=findViewById(R.id.btnVolver);

        txtDatos = findViewById(R.id.txtDatos);
        Bundle datos = getIntent().getExtras();
        txtDatos.setText(datos.getString("email"));
    }

    public void Activity1(View view) {
        Intent intav = new Intent(MainActivity2.this, Login.class);
        startActivity(intav);
        finish();
    }
}