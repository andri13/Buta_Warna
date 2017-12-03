package com.example.andri.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityAbout extends AppCompatActivity {

    private Button mButtnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        // Back /*

        mButtnStart = (Button) findViewById(R.id.back_to_activity);

        mButtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityAbout.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }
}
