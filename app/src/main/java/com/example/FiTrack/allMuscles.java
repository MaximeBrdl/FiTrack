package com.example.FiTrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class allMuscles extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_muscles);

        ImageButton returnb = findViewById(R.id.returnM);
        returnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allMuscles.this, home_page.class));
            }
        });

        ImageButton allM1 = findViewById(R.id.allM1);
        allM1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allMuscles.this, allMuscles.class));
            }
        });

        ImageButton allM2 = findViewById(R.id.allM2);
        allM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allMuscles.this, allMuscles.class));
            }
        });

        ImageButton allM3 = findViewById(R.id.allM3);
        allM3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allMuscles.this, allMuscles.class));
            }
        });

        ImageButton allM4 = findViewById(R.id.allM4);
        allM4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allMuscles.this, allMuscles.class));
            }
        });

        ImageButton allM5 = findViewById(R.id.allM5);
        allM5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allMuscles.this, allMuscles.class));
            }
        });

        ImageButton menu1 = findViewById(R.id.homeM);
        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allMuscles.this, home_page.class));
            }
        });

        ImageButton menu2 = findViewById(R.id.searchM);
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allMuscles.this, allMuscles.class));
            }
        });

        ImageButton menu3 = findViewById(R.id.programM);
        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allMuscles.this, program_page.class));
            }
        });

        ImageButton menu4 = findViewById(R.id.profileM);
        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allMuscles.this, allMuscles.class));
            }
        });
    }
}