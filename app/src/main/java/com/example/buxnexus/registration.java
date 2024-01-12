package com.example.buxnexus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class registration extends AppCompatActivity {
    String[] items={"Student","Teacher","Driver"};

    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterItems;

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        adapterItems=new ArrayAdapter<String>(this,R.layout.list_item,items);
        autoCompleteTextView =findViewById(R.id.auto_complete_txt);
        autoCompleteTextView.setAdapter(adapterItems);



        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item=parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "item: "+item, Toast.LENGTH_SHORT).show();
//                ((TextView) parent.getChildAt(position)).setTextColor(0*00000000);
            }
        });

        btn=findViewById(R.id.Registration_Btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(registration.this,login.class);
                startActivity(intent);
            }
        });
    }
}