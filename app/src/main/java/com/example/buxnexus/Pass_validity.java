package com.example.buxnexus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pass_validity extends AppCompatActivity {

    AppCompatButton btnHome,btnRenew,btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_validity);

        btnHome=findViewById(R.id.Pass_Validity_Home_Btn);
        btnBack=findViewById(R.id.Pass_Validity_Back_Btn);
        btnRenew=findViewById(R.id.Pass_Validity_Renew_Btn);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Pass_validity.this,HomePage.class);
                startActivity(intent);
            }
        });
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Pass_validity.this,HomePage.class);
                startActivity(intent);
            }
        });

        btnRenew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Pass_validity.this,HomePage.class);
                startActivity(intent);
            }
        });
    }
}