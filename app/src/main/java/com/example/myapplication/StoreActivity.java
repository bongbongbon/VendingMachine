package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class StoreActivity extends AppCompatActivity {
    private ImageView imgv_banana, imgv_plum, imgv_abocado, imgv_tomato,imgv_bagel, imgv_apple, imgv_main;
    private Button btn_charge;

    private TextView tv_usermoney ;

    private EditText edt_chargemoney;

    int usermoney, money;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);


        imgv_apple = findViewById(R.id.imgv_apple_green);
        imgv_bagel = findViewById(R.id.imgv_bagel);
        imgv_tomato = findViewById(R.id.imgv_tomato);
        imgv_abocado = findViewById(R.id.imgv_avocado_half);
        imgv_plum = findViewById(R.id.imgv_plum);
        imgv_banana = findViewById(R.id.imgv_banana);
        imgv_main = findViewById(R.id.imgv_main);


        btn_charge = findViewById(R.id.btn_charge);




        edt_chargemoney =findViewById(R.id.edt_chargeMoney);
        tv_usermoney = findViewById(R.id.tv_userMoney);
        btn_charge.setOnClickListener(v -> {
            money = Integer.parseInt(edt_chargemoney.getText().toString());
            usermoney += money;
            tv_usermoney.setText(usermoney+"원");

        });


        imgv_banana.setOnClickListener(v -> {
           imgv_main.setVisibility(View.VISIBLE);
            imgv_main.setImageResource(R.drawable.banana);
        });

        imgv_plum.setOnClickListener(v -> {
            imgv_main.setVisibility(View.VISIBLE);
            imgv_main.setImageResource(R.drawable.plum);
        });

        imgv_abocado.setOnClickListener(v -> {
            imgv_main.setVisibility(View.VISIBLE);
            imgv_main.setImageResource(R.drawable.avocado_half);
        });

        imgv_tomato.setOnClickListener(v -> {
            imgv_main.setVisibility(View.VISIBLE);
            imgv_main.setImageResource(R.drawable.tomato);
        });

        imgv_bagel.setOnClickListener(v -> {
            imgv_main.setVisibility(View.VISIBLE);
            imgv_main.setImageResource(R.drawable.bagel);
        });

        imgv_apple.setOnClickListener(v -> {
            imgv_main.setVisibility(View.VISIBLE);
            imgv_main.setImageResource(R.drawable.apple_green);
        });








    }
}