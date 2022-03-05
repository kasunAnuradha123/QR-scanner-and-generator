package com.example.qr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class SpalshScreen extends AppCompatActivity {

    ImageView wel;
    ProgressBar ppb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh_screen);

        wel=findViewById(R.id.splico);
        ppb =findViewById(R.id.pgr);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SpalshScreen.this, MainActivity.class);
                startActivity(intent);
                finish();


            }

        }, 1000);
    }

}