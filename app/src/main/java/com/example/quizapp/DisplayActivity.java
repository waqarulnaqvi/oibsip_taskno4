package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Thread th = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(4000);
                }

                catch (Exception e){
                    e.printStackTrace();
                }

                finally {
                    Intent i = new Intent(DisplayActivity.this, MainActivity.class);
                    startActivity(i);
                }
            }


        };th.start();
    }
}