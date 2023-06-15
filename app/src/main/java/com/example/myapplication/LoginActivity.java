package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {

    EditText user_id, user_pw;
    Button btn_login, btn_join_member, btn_find_id_pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        user_id = findViewById(R.id.user_id);
        user_pw = findViewById(R.id.user_pw);
        btn_login = findViewById(R.id.btn_login);
        btn_join_member = findViewById(R.id.btn_join_member);
        btn_find_id_pw = findViewById(R.id.btn_find_id_pw);



        // 로그인 화면
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (user_id.getText().toString().equals("admin") && user_pw.getText().toString().equals("admin1234")) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("idkey", user_id.getText().toString());
                    MenuList menuList= new MenuList();
                    menuList.baseList();
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "아이디 혹은 비밀번호가 틀립니다.", Toast.LENGTH_SHORT).show();
                };
            }
        });



    }


}
