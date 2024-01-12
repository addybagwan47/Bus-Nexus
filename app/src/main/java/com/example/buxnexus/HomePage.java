package com.example.buxnexus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class HomePage extends AppCompatActivity {


    public CardView CVNewPAss,CVBusDetail,CVLocation,CVPassValidity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        CVNewPAss=findViewById(R.id.Card_new_Pass);
        CVBusDetail=findViewById(R.id.Card_Bus_Detail);
        CVLocation=findViewById(R.id.LOCATION);
        CVPassValidity=findViewById(R.id.Card_Pass_Validity);


        CVNewPAss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomePage.this,new_pass.class);
                startActivity(intent);

            }
        });

        CVLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomePage.this,location.class);
                startActivity(intent);

            }
        });



        CVPassValidity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomePage.this,Pass_validity.class);
                startActivity(intent);

            }
        });


        CVBusDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomePage.this,bus_detail.class);
                startActivity(intent);

            }
        });





    }


}