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

public class Test9 extends AppCompatActivity {

    private Button mButtnStart;
    TextView q9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test9);
        q9 = (TextView) findViewById(R.id.q9);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Back /*

        mButtnStart = (Button) findViewById(R.id.back);

        mButtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test9.this, Test8.class);
                startActivity(intent);

            }
        });

        // Next /*

        mButtnStart = (Button) findViewById(R.id.next);

        mButtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test9.this, Test10.class);
                startActivity(intent);

            }
        });

    }
    public void show9(View v){
        q9.setText("45");
    }
}
