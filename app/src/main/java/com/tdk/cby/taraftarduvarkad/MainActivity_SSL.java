package com.tdk.cby.taraftarduvarkad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity_SSL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter_SSL(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                Intent syf = new Intent(MainActivity_SSL.this,FotografGoster.class);
                syf.putExtra("lig", (int) 1);
                syf.putExtra("takim", (int) position);
                startActivity(syf);

               /* Toast.makeText(MainActivity_SSL.this, "" + position,
                        Toast.LENGTH_SHORT).show();*/
            }
        });
    }
}
