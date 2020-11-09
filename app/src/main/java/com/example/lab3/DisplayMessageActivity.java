package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_mesage);

        Intent intent = getIntent();
        String massege = intent.getStringExtra(tute1.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.textView);
        textView.setText(massege);
    }
}