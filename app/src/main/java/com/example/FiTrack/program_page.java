package com.example.FiTrack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class program_page extends AppCompatActivity {

    Button button;
    BottomSheetDialog sheetDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.program_page);

        button=findViewById(R.id.buttonprogram);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheetDialog=new BottomSheetDialog(program_page.this,R.style.AppBottomSheetDialogTheme) ;

                sheetDialog.setContentView(R.layout.sheet_layout);

                sheetDialog.show();
            }
        });
    }
}
