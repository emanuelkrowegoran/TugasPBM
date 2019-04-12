package com.gmail.emanuelkrowegoran.pbmjava;
//Mendeklarasikan package yang digunakan

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
//Menginportkan data data android yang dibutuhkan

public class Login extends AppCompatActivity {
//keleas Login yang bersifat public

    EditText username, password;
    Button btnLogin;
//Mendeklarasikan EditText dan button yang digunakan
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//Menghubungkan kelas ini ke kelas xml

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnLogin);
//Mendeklarasikan button dan text pada kelas ini yang diambil pada kelas xml

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();
//Pada button Login ketika diklik maka akan mengambil username dan pasword yang telah diinputkan

                if (usernameKey.equals("Emanuel") && passwordKey.equals("165410097")) {
                    //Menggunakan If jika username = Emanuel dan pasword 165410097 yang diinputkan malaLogin berhasil
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    Login.this.startActivity(intent);
                    finish();
                    //Jika sesuai maka pindah ke layout selanjutnya dengan fungsi intent ke kelas MainActivty
                } else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                    builder.setMessage("Username atau Password Anda salah!")
                            .setNegativeButton("Retry", null).create().show();
                    //Jika gagal maka akan ada pemberitahuan username dan paswword salah.
                }
            }
        });

    }
    //Sedangkan pada button registrasi kita menggunakan intent pada buttonOnclick nya
        //ketika diklik maka akan dipindahkan ke layout Registrasi
  public void ButtonOnClick(View View) {
       Intent intent = new Intent(Login.this, Registrasi.class);
        Login.this.startActivity(intent);

    }
}