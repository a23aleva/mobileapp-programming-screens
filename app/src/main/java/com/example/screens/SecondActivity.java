package com.example.screens;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            int number = extras.getInt("number");
            TextView textView = findViewById(R.id.textView);
            TextView textView2 = findViewById(R.id.textView2);
            textView.setText(name);
            textView2.setText("" + number);
        }
    }
}