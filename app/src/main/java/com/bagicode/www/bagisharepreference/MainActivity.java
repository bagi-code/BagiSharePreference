package com.bagicode.www.bagisharepreference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText tnama;
    SessionSharePreference session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        session = new SessionSharePreference(MainActivity.this.getApplicationContext());

        tnama = (EditText) findViewById(R.id.nama);
        Button btnSave = (Button) findViewById(R.id.btn_save);
        Button btnLihat = (Button) findViewById(R.id.btn_lihat);
        Button btnHapus = (Button) findViewById(R.id.btn_hapus);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = String.valueOf(tnama.getText());
                session.setNama(nama);
            }
        });

        btnLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = session.getNama();
                tnama.setText(nama);
            }
        });

        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                session.setNama("");
            }
        });
    }
}
