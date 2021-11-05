package com.example.utsfebymf;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.utsfebymf.MainActivity;
import com.example.utsfebymf.R;

public class SplashActivity extends Activity {
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mImageView = findViewById(R.id.image_view);

        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(2000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}