package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_store;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_store = findViewById(R.id.btn_store);

        btn_store.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), StoreActivity.class);
            startActivity(intent);

        });
    }

}