package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MembershipActivity extends AppCompatActivity {
    EditText edt_userId,edt_userPw,edt_userGender,edt_userPhone,edt_userEmail,edt_userClass,edt_userAge;
    Button btn_membership;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membership);

        edt_userId=findViewById(R.id.edt_userId);
        edt_userPw=findViewById(R.id.edt_userPw);
        edt_userGender=findViewById(R.id.edt_userGender);
        edt_userPhone=findViewById(R.id.edt_userPhone);
        edt_userEmail=findViewById(R.id.edt_userEmail);
        edt_userClass=findViewById(R.id.edt_userClass);
        edt_userAge=findViewById(R.id.edt_userAge);
        
        btn_membership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String id= edt_userId.getText().toString();
               String pw= edt_userPw.getText().toString();
               String gender= edt_userGender.getText().toString();
               String phone= edt_userPhone.getText().toString();
               String email= edt_userEmail.getText().toString();
               String userClass= edt_userClass.getText().toString();
               String age= edt_userAge.getText().toString();

                if (age == null) {
                    
                }
                
                
            }
        });
    }
}