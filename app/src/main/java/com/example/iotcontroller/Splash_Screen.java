package com.example.iotcontroller;

import androidx.appcompat.app.AppCompatActivity;
import com.example.iotcontroller.MainActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import java.util.Random;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Splash Screen Function
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Screen.this,  MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}