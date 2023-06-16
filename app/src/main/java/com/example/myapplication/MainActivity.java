package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn_store, btn_info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String id = intent.getStringExtra("idkey");



        btn_store = findViewById(R.id.btn_store);
        btn_info = findViewById(R.id.btn_info);


        Log.d("ㅎㅇ", "onCreate: "+id);

        btn_store.setOnClickListener(v -> {
            Intent intent1 = new Intent(this, StoreActivity.class );
            startActivity(intent1);
        });

        btn_info.setOnClickListener(v -> {
            Intent intent2 = new Intent(this, InfoActivity.class );
            startActivity(intent2);
        });



    }

}