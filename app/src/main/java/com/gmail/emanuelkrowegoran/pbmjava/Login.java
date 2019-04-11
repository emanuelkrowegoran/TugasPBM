package com.gmail.emanuelkrowegoran.pbmjava;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;
    Button btnRgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRgs = (Button) findViewById(R.id.btnRgs);
        btnRgs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Registrasi.class);
                Login.this.startActivity(intent);

        btnLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String usernameKey = username.getText().toString();
                        String passwordKey = password.getText().toString();

                        if (usernameKey.equals("Emanuel") && passwordKey.equals("165410097")) {
                            //jika login berhasil
                            Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Login.this, MainActivity.class);
                            Login.this.startActivity(intent);
                            finish();
                        } else {
                            //jika login gagal
                            AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                            builder.setMessage("Username atau Password Anda salah!")
                                    .setNegativeButton("Retry", null).create().show();


                        }
                    }
                });

            }
        });
    }
}