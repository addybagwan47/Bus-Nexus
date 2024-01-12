package com.example.buxnexus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bus_detail extends AppCompatActivity {

    AppCompatButton btn,btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_detail);

        btn=findViewById(R.id.Bus_Detail_Back_Btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(bus_detail.this,HomePage.class);
                startActivity(intent);
            }
        });
        btnHome=findViewById(R.id.Bus_Detail_Home_Btn);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(bus_detail.this,HomePage.class);
                startActivity(intent);
            }
        });
    }
}