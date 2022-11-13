package com.example.headbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Registro extends AppCompatActivity {
    Button RgUs;
    EditText Nombres,Apellidos,Edad,Telefono,Direccion,Correo, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }
}