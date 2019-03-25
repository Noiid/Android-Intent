package com.splash.tugasintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView textNama;
    private TextView textAlamat;
    private TextView textNoh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String nama = extras.getString("NAME");
        String alamat = extras.getString("ALAMAT");
        String noh = extras.getString("NOH");

        textNama = (TextView) findViewById(R.id.textViewNama);
        textAlamat = (TextView) findViewById(R.id.textViewAlamat);
        textNoh = (TextView) findViewById(R.id.textViewNohp);

        textNama.setText(nama);
        textAlamat.setText(alamat);
        textNoh.setText(noh);
    }

    public void launchShare(View view) {
        String hasil = "Nama : "+textNama.getText().toString() + "\n" +
                "Alamat : "+textAlamat.getText().toString();
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, hasil);
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }
}
