package com.example.FiTrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class allPrograms extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_programs);

        ImageButton returnb = findViewById(R.id.returnM);
        returnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allPrograms.this, home_page.class));
            }
        });

        ImageButton allP1 = findViewById(R.id.allP1);
        allP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allPrograms.this, program_page.class));
            }
        });

        ImageButton allP2 = findViewById(R.id.allP2);
        allP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allPrograms.this, program_page.class));
            }
        });

        ImageButton allP3 = findViewById(R.id.allP3);
        allP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allPrograms.this, program_page.class));
            }
        });

        ImageButton allP4 = findViewById(R.id.allP4);
        allP4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allPrograms.this, program_page.class));
            }
        });

        ImageButton menu1 = findViewById(R.id.homeM);
        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allPrograms.this, home_page.class));
            }
        });

        ImageButton menu2 = findViewById(R.id.searchM);
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allPrograms.this, allPrograms.class));
            }
        });

        ImageButton menu3 = findViewById(R.id.programM);
        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allPrograms.this, program_page.class));
            }
        });

        ImageButton menu4 = findViewById(R.id.profileM);
        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allPrograms.this, allPrograms.class));
            }
        });
    }
}