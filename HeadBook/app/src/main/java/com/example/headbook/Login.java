package com.example.headbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button val;
    EditText et1, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et1 = findViewById(R.id.etEmail);
        et2 = findViewById(R.id.etPass);
        val = findViewById(R.id.val);

        val.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email =et1.getText().toString();
                String pass =et2.getText().toString();

                if (email.equals("justinianomoya@gmail.com") && pass.equals("Jesus123")) {
                    Toast.makeText(Login.this, "Conforme", Toast.LENGTH_SHORT).show();

                    Intent login = new Intent(Login.this, MainActivity2.class);
                    login.putExtra("email", email);
                    startActivity(login);
                } else {
                    Toast.makeText(Login.this, "Contraseña o Usuario incorrectas", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}