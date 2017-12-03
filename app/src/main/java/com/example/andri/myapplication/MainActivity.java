package com.example.andri.myapplication;

import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Button mButtnStart;
    private AlertDialog.Builder alertDialogBuilder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btn_keluar = (Button) findViewById(R.id.exit);
        btn_keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });



        // Pengertian /*

        mButtnStart = (Button) findViewById(R.id.pengertian);

        mButtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_Pengertian.class);
                startActivity(intent);

            }
        });


        // Gejala /*

        mButtnStart = (Button) findViewById(R.id.gejala);

        mButtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_Gejala.class);
                startActivity(intent);

            }
        });


        // Peyebab /*

        mButtnStart = (Button) findViewById(R.id.penyebab);

        mButtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_Penyebab.class);
                startActivity(intent);

            }
        });


        // Diagnosis /*

        mButtnStart = (Button) findViewById(R.id.diagnosis);

        mButtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_Diagnosis.class);
                startActivity(intent);

            }
        });


        // Penting /*

        mButtnStart = (Button) findViewById(R.id.penting);

        mButtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_Penting.class);
                startActivity(intent);
            }
        });


        // Tipe /*

        mButtnStart = (Button) findViewById(R.id.tipey);

        mButtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_Tipe2.class);
                startActivity(intent);
            }
        });

        // Test /*

        mButtnStart = (Button) findViewById(R.id.test);

        mButtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tes1.class);
                startActivity(intent);
            }
        });

        // About /*

        mButtnStart = (Button) findViewById(R.id.about);

        mButtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
            }
        });


    }

}




