package com.example.buxnexus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    String[] items={"Student","Teacher","Driver"};

    AppCompatButton btn;
    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

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

        btn=findViewById(R.id.Login_Btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(login.this,HomePage.class);
                startActivity(intent);
            }
        });
    }
}