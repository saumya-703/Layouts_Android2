package com.project.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg= findViewById(R.id.rg);
        submit=findViewById(R.id.submit);

        show( );
    }

    public void show() {
        submit.setOnClickListener((view -> {
            int k=rg.getCheckedRadioButtonId();
            Toast.makeText(MainActivity.this,"Selected", Toast.LENGTH_SHORT).show();
        }));
    }
}