package com.example.FiTrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class home_page extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        ImageButton menu1 =findViewById(R.id.imageButton2);
        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(home_page.this, home_page.class));
            }
        });

        ImageButton menu2 =findViewById(R.id.imageButton7);
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(home_page.this, home_page.class));
            }
        });

        ImageButton menu3 =findViewById(R.id.imageButton4);
        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(home_page.this, program_page.class));
            }
        });

        ImageButton menu4 =findViewById(R.id.imageButton6);
        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(home_page.this, home_page.class));
            }
        });

        ImageButton program1 =findViewById(R.id.imageButton);
        program1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(home_page.this, program_page.class));
            }
        });

        ImageButton program2 =findViewById(R.id.imageButton3);
        program2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(home_page.this, program_page.class));
            }
        });

        ImageButton program3 =findViewById(R.id.imageButton5);
        program3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(home_page.this, program_page.class));
            }
        });

        ImageButton program4 =findViewById(R.id.imageButton8);
        program4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(home_page.this, program_page.class));
            }
        });

        ImageButton muscle1 =findViewById(R.id.imageButton9);
        muscle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(home_page.this, home_page.class));
            }
        });

        ImageButton muscle2 =findViewById(R.id.imageButton10);
        muscle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(home_page.this, home_page.class));
            }
        });

        ImageButton muscle3 =findViewById(R.id.imageButton11);
        muscle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(home_page.this, home_page.class));
            }
        });

        ImageButton muscle4 =findViewById(R.id.imageButton12);
        muscle4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(home_page.this, home_page.class));
            }
        });

        ImageButton muscle5 =findViewById(R.id.imageButton13);
        muscle5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(home_page.this, home_page.class));
            }
        });

        ImageButton see_all_programs =findViewById(R.id.imageButton13);
        see_all_programs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(home_page.this, program_page.class));
            }
        });

        ImageButton see_all_muscles =findViewById(R.id.imageButton13);
        see_all_muscles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(home_page.this, home_page.class));
            }
        });
    }
}
