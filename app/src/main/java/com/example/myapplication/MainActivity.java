package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_store, btn_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_store = findViewById(R.id.btn_store);
        btn_info = findViewById(R.id.btn_info);

        btn_store.setOnClickListener(v -> {
            Intent intent = new Intent(this,StoreActivity.class  );
            startActivity(intent);
        });

        btn_info.setOnClickListener(v -> {
            Intent intent = new Intent(this,InfoActivity.class );
            startActivity(intent);
        });



    }

}