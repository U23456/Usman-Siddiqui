package com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.eventplanner.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class showads extends AppCompatActivity {
    AdView adView1,adView2;
    InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showads);
        adView1=findViewById(R.id.ad_view1);
        adView2=findViewById(R.id.ad_view2);
        MobileAds.initialize(this,"ca-app-pub-3291478411071467~6055758418");
        AdRequest adRequest = new AdRequest.Builder().build();
        adView1.loadAd(adRequest);
        adView2.loadAd(adRequest);
        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-3291478411071467/3364842431");
        interstitialAd.loadAd(new AdRequest.Builder().build());

    }
}