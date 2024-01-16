package com.example.buxnexus;

import androidx.activity.result.contract.ActivityResultContracts;
import org.jetbrains.annotations.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

public class login extends AppCompatActivity {

    String[] items={"Student","Teacher","Driver"};

    AppCompatButton btn;
    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterItems;
    GoogleSignInOptions gso;
    GoogleSignInClient gsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn = findViewById(R.id.gle_Btn_login);
        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc = GoogleSignIn.getClient(this,gso);
        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);

        if(acct!=null)
        {
            navigate();
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIn();
            }
        });





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



    void signIn() {
        Intent signInIntent = gsc.getSignInIntent();
        startActivityForResult(signInIntent,1000);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1000)
        {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                task.getResult(ApiException.class);
                navigate();
            } catch (ApiException e) {
                Toast.makeText(getApplicationContext(),"Something Went Wrong",Toast.LENGTH_SHORT).show();
            }
        }
    }
    void navigate(){
        finish();
        Intent intent = new Intent(login.this, HomePage.class);
        startActivity(intent);
    }
}
