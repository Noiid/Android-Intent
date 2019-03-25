package com.splash.tugasintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nama;
    private EditText alamat;
    private EditText nohp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nama = (EditText) findViewById(R.id.edittext_nama);
        alamat = (EditText) findViewById(R.id.edittext_alamat);
        nohp = (EditText) findViewById(R.id.edittext_noh);

    }
    public void launchResult1(View view){

    }

    public void launchResult(View view) {
        Intent intent = new Intent(this,ResultActivity.class);
        String isi_nama = nama.getText().toString();
        String isi_alamat = alamat.getText().toString();
        String isi_nohp = nohp.getText().toString();

        Bundle extras = new Bundle();
        extras.putString("NAME",isi_nama);
        extras.putString("ALAMAT",isi_alamat);
        extras.putString("NOH",isi_nohp);
        intent.putExtras(extras);
        startActivity(intent);
    }
}
