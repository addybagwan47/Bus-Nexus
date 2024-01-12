package com.example.buxnexus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class new_pass extends AppCompatActivity {

    AppCompatButton btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_pass);

        btnBack=findViewById(R.id.New_Pass_Back_Btn);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(new_pass.this,HomePage.class);
                startActivity(intent);
            }
        });
    }
}