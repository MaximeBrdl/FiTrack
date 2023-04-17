package com.example.FiTrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ExPage extends AppCompatActivity {

    Button button;
    BottomSheetDialog sheetDialog;
    FirebaseAuth auth;
    FirebaseUser user;


    //@SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_page);

        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();

        if (user == null)
        {
            Intent intent = new Intent(getApplicationContext(), Starter.class);
            startActivity(intent);
            finish();
        }

        button = findViewById(R.id.buttonClickExPage);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheetDialog=new BottomSheetDialog(ExPage.this, R.style.AppBottomSheetDialogTheme) ;

                sheetDialog.setContentView(R.layout.sheet_layout);

                sheetDialog.show();
            }
        });
    }
}