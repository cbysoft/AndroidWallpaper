package com.tdk.cby.taraftarduvarkad;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class introcby extends AppCompatActivity {
    private static int gosterim_suresi = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introcby);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Toast.makeText(getApplicationContext(),"Bu bir CBY yazilim ürünüdür.",Toast.LENGTH_LONG).show();
                Intent i = new Intent(introcby.this, Giris.class);
                startActivity(i);

                finish();
            }
        }, gosterim_suresi);
    }
}
