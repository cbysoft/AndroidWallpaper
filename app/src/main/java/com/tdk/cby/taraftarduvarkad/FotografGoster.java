package com.tdk.cby.taraftarduvarkad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FotografGoster extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotograf_goster);
        Bundle ligg = getIntent().getExtras();
        int lig= ligg.getInt("lig");
        Bundle tkm = getIntent().getExtras();
        int takim= tkm.getInt("takim");

        ImageView resim1=(ImageView) findViewById(R.id.r1);
        ImageView resim2=(ImageView) findViewById(R.id.r2);
        ImageView resim3=(ImageView) findViewById(R.id.r3);
        ImageView resim4=(ImageView) findViewById(R.id.r4);

        if(lig==1){
            if(takim==0){
                resim1.setImageResource(R.drawable.akhisar_wl);
                resim2.setImageResource(R.drawable.akhisar2_wl);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==1){
                resim1.setImageResource(R.drawable.alanyaspor_wl);
                resim2.setImageResource(R.drawable.alanyaspor2_wl);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==2){
                resim1.setImageResource(R.drawable.antalya_wl);
                resim2.setImageResource(R.drawable.antalya2_wl);
                resim3.setImageResource(R.drawable.antalya3_wl);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==3){
                resim1.setImageResource(R.drawable.basaksehir_wl);
                resim2.setImageResource(R.drawable.basaksehir2_wl);
                resim3.setImageResource(R.drawable.basaksehir3_wl);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==4){
                resim1.setImageResource(R.drawable.bjk_wl);
                resim2.setImageResource(R.drawable.bjk2_wl);
                resim3.setImageResource(R.drawable.bjl3_wl);
                resim4.setImageResource(R.drawable.bjk5_wl);
            }
            else if(takim==5){
                resim1.setImageResource(R.drawable.bursa_wl);
                resim2.setImageResource(R.drawable.bursa2_wl);
                resim3.setImageResource(R.drawable.bursa3_wl);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==6){
                resim1.setImageResource(R.drawable.fener_wl);
                resim2.setImageResource(R.drawable.fener2_wl);
                resim3.setImageResource(R.drawable.fener3_wl);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==7){
                resim1.setImageResource(R.drawable.genclerbirligi_wl);
                resim2.setImageResource(R.drawable.genclerbirligi2_wl);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==8){
                resim1.setImageResource(R.drawable.goztepe_wl);
                resim2.setImageResource(R.drawable.goztepe2_wl);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==9){
                resim1.setImageResource(R.drawable.gs_wl);
                resim2.setImageResource(R.drawable.gs2_wl);
                resim3.setImageResource(R.drawable.gs3_wl);
                resim4.setImageResource(R.drawable.gs4_wl);
            }
            else if(takim==10){
                resim1.setImageResource(R.drawable.karabuk_wl);
                resim2.setImageResource(R.drawable.karabuk2_wl);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==11){
                resim1.setImageResource(R.drawable.kasimpasa_wl);
                resim2.setVisibility(View.INVISIBLE);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==12){
                resim1.setImageResource(R.drawable.kayseri_wl);
                resim2.setImageResource(R.drawable.kayseri2_wl);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==13){
                resim1.setImageResource(R.drawable.konya_wl);
                resim2.setImageResource(R.drawable.konya2_wl);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==14){
                resim1.setImageResource(R.drawable.malatya_wl);
                resim2.setImageResource(R.drawable.malatya2_wl);
                resim3.setImageResource(R.drawable.malatya3_wl);
                resim4.setImageResource(R.drawable.malatya4_wl);
            }
            else if(takim==15){
                resim1.setImageResource(R.drawable.osmanli_wl);
                resim2.setImageResource(R.drawable.osmanli2_wl);
                resim3.setImageResource(R.drawable.osmanli3_wl);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==16){
                resim1.setImageResource(R.drawable.sivas_wl);
                resim2.setImageResource(R.drawable.sivas2_wl);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==17){
                resim1.setImageResource(R.drawable.trabzon_wl);
                resim2.setImageResource(R.drawable.trabzon2_wl);
                resim3.setImageResource(R.drawable.trabzon3_wl);
                resim4.setImageResource(R.drawable.trabzon4_wl);
            }


        }
        else if(lig==2){
            if(takim==0){
                resim1.setImageResource(R.drawable.adanademir_wl);
                resim2.setImageResource(R.drawable.adanademir2_wl);
                resim1.setImageResource(R.drawable.adanademir3_wl);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==1){
                resim1.setImageResource(R.drawable.adanaspor_wl);
                resim2.setImageResource(R.drawable.adanaspor2_wl);
                resim1.setImageResource(R.drawable.adanaspor3_wl);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==2){
                resim1.setImageResource(R.drawable.altinordu_wl);
                resim2.setImageResource(R.drawable.altinordu2_wl);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==3){
                resim1.setImageResource(R.drawable.ankara_wl);
                resim2.setImageResource(R.drawable.ankara2_wl);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==4){
                resim1.setImageResource(R.drawable.balikesirspor_wl);
                resim2.setImageResource(R.drawable.balikesirspor2_wl);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==5){
                resim1.setImageResource(R.drawable.erzurumspor_wl);
                resim2.setVisibility(View.INVISIBLE);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==6){
                resim1.setImageResource(R.drawable.bolu_wl);
                resim2.setImageResource(R.drawable.boluspor_wl);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==7){
                resim1.setImageResource(R.drawable.rize_wl);
                resim2.setVisibility(View.INVISIBLE);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==8){
                resim1.setImageResource(R.drawable.denizli_wl);
                resim2.setImageResource(R.drawable.denizli2_wl);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==9){
                resim1.setImageResource(R.drawable.elaziz_wl);
                resim2.setImageResource(R.drawable.elaziz2_wl);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==10){
                resim1.setImageResource(R.drawable.eses_wl);
                resim2.setImageResource(R.drawable.es2_wl);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==11){
                resim1.setImageResource(R.drawable.gaziantepbbs_wl);
                resim2.setVisibility(View.INVISIBLE);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==12){
                resim1.setImageResource(R.drawable.gaziantep_wl);
                resim2.setImageResource(R.drawable.gaziantep2_wl);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==13){
                resim1.setImageResource(R.drawable.giresun_wl);
                resim2.setImageResource(R.drawable.giresun2_wl);
                resim2.setImageResource(R.drawable.giresun3_wl);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==14){
                resim1.setImageResource(R.drawable.istanbl_wl);
                resim2.setImageResource(R.drawable.istanbl2_wl);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==15){
                resim1.setImageResource(R.drawable.manisa_wl);
                resim2.setVisibility(View.INVISIBLE);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==16){
                resim1.setImageResource(R.drawable.samsun_wl);
                resim2.setImageResource(R.drawable.samsun2_wl);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
            else if(takim==17){
                resim1.setImageResource(R.drawable.umraniye_wl);
                resim2.setVisibility(View.INVISIBLE);
                resim3.setVisibility(View.INVISIBLE);
                resim4.setVisibility(View.INVISIBLE);
            }
        }
        else{}

    }
}
