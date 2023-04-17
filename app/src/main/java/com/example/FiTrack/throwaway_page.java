package com.example.FiTrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class throwaway_page extends AppCompatActivity {

    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.throwaway_page);

        Button loginB =findViewById(R.id.button3);
        loginB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(throwaway_page.this, home_page.class));
            }
        });
    }
}