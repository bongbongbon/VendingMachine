package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class InfoActivity extends AppCompatActivity {

        Button btn_back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        btn_back1 = findViewById(R.id.btn_back1);

        btn_back1.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
        });


    }
}