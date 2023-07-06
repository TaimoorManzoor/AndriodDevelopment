package com.example.splashscreenproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //Splash Screen Code
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Navigate splashscreen to Another Screen
                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
            }


        },4000);
    }
}