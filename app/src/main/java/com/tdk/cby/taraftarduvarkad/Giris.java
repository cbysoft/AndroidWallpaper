package com.tdk.cby.taraftarduvarkad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Giris extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris2);
    }
    public void pttgiris(View view){
        Intent syf = new Intent(Giris.this,MainActivity_PTT.class);
        startActivity(syf);
    }
    public void sslgiris(View view){
        Intent syf = new Intent(Giris.this,MainActivity_SSL.class);
        startActivity(syf);
    }
}
