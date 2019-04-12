package com.gmail.emanuelkrowegoran.pbmjava;
//Mendeklarasikan package yang digunakan

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Registrasi extends AppCompatActivity {
    //mendeklarasikan button yang di gunakan pada kelas Registrasii yaitu button dengan nama btnOK
    Button btnOK;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        //Menghubungkan kelas ini ke kelas xml activty_registrasi

        btnOK = (Button) findViewById(R.id.btnOK);
        //Mendeklarasikan button yang akan digunakan pada kelas ini yang terhubung pada kelas xml

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registrasi.this, MainActivity.class);
               Registrasi.this.startActivity(intent);
        //Membuat action intent pada button btnOK ketika diklik maka akan berpindah ke layout MainActivty
    }
});
    }
}