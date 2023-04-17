package com.example.FiTrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class mainPage extends AppCompatActivity {

    Button buttonLogout, buttonLinkExPage;
    FirebaseAuth auth;
    TextView pseudo;
    FirebaseUser user;
    BottomSheetDialog sheetDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);


        auth = FirebaseAuth.getInstance();
        buttonLogout = findViewById(R.id.buttonLogout);
        buttonLinkExPage = findViewById(R.id.buttonExPage);
        pseudo = findViewById(R.id.textPseudo);
        user = auth.getCurrentUser();

        if (user == null)
        {
            Intent intent = new Intent(getApplicationContext(), Starter.class);
            startActivity(intent);
            finish();
        }else {
            pseudo.setText(user.getEmail().replace("@gmail.com", ""));
        }

        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(), Starter.class);
                startActivity(intent);
                finish();
            }
        });

        buttonLinkExPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), com.example.FiTrack.ExPage.class);
                startActivity(intent2);
                finish();
            }
        });



    }
}