package com.gmail.emanuelkrowegoran.pbmjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Registrasi extends AppCompatActivity {
    //mendeklarasikan button yang di gunakan pada kelas Registrasii yaitu button dengan nama btnOK
    Button btnOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //
        setContentView(R.layout.activity_registrasi);

        btnOK = (Button) findViewById(R.id.btnOK);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registrasi.this, MainActivity.class);
               Registrasi.this.startActivity(intent);
    }
});
    }
}