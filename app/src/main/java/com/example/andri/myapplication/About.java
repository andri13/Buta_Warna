package com.example.andri.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about2);
    }

    public void back_ma(View view) {
        Intent intent = new Intent(About.this, MainActivity.class);
        startActivity(intent);
    }
}
