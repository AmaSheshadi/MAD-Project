package com.example.lab3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import static android.content.ClipData.newIntent;

public class tute1 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.lab3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tute1);
    }
    public void sendMassege(View view){
        Intent intent = newIntent(this,DisplayMessageActivity.class);
        EditText editText = (EditText)findViewById(R.id.editText);
        String massege = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,massege);
        startActivity(intent);
    }
}