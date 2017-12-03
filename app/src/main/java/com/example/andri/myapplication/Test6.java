package com.example.andri.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class Test6 extends AppCompatActivity {

    private Button mButtnStart;
    TextView q6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test6);
        q6 = (TextView) findViewById(R.id.q6);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Back /*

        mButtnStart = (Button) findViewById(R.id.back);

        mButtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test6.this, Test5.class);
                startActivity(intent);

            }
        });

        // Next /*

        mButtnStart = (Button) findViewById(R.id.next);

        mButtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test6.this, Test7.class);
                startActivity(intent);

            }
        });

    }

    public void show6(View v){
        q6.setText("15");
    }
}
