package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


import com.example.eventplanner.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class UI extends AppCompatActivity {
    Button wedding,Restruant,TentService,Location,Budget,Gmail,Phone,Payment,ads;
    AdView adView1,adView2;
    InterstitialAd interstitialAd;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_i);

        wedding=(Button)findViewById(R.id.btn_wedding);
        Restruant=(Button)findViewById(R.id.btn_res);
        TentService=(Button)findViewById(R.id.btn_tent);
        Location=(Button)findViewById(R.id.btn_location);
        Budget=(Button)findViewById(R.id.btn_bud);
        Gmail=(Button)findViewById(R.id.btn_gmail);
        Phone=(Button)findViewById(R.id.btn_phone);
        Payment=(Button)findViewById(R.id.btn_pay);
        ads=(Button) findViewById(R.id.ads);
        wedding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.UI.this,com.wedding.class);
                startActivity(i);

            }
        });
        Location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.UI.this,com.Location.class);
                startActivity(i);
            }
        });
        Budget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(com.UI.this,com.Budget.class);
                startActivity(i);
            }
        });
        Phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.UI.this,com.Phone.class);
                startActivity(i);
            }
        });
        Gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.UI.this,com.Gmail.class);
                startActivity(i);
            }
        });
        Payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.UI.this,com.Payment.class);
                startActivity(i);
            }
        });
        ads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.UI.this,com.showads.class);
                startActivity(i);
            }
        });



    }
}