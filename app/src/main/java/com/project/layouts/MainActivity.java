package com.project.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton pb,gs,lb;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb=findViewById(R.id.pb);
        gs=findViewById(R.id.gs);
        lb=findViewById(R.id.lb);
        submit=findViewById(R.id.submit);

        show();
    }

    public void show() {
        submit.setOnClickListener((view -> {
            int k= pb.getChecke
        }));
    }
}