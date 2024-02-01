package com.example.buxnexus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginManager;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import org.json.JSONException;
import org.json.JSONObject;

public class HomePage extends AppCompatActivity {

    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
    Button btn;

    public CardView CVNewPAss,CVBusDetail,CVLocation,CVPassValidity;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        CVNewPAss=findViewById(R.id.Card_new_Pass);
        CVBusDetail=findViewById(R.id.Card_Bus_Detail);
        CVLocation=findViewById(R.id.LOCATION);
        CVPassValidity=findViewById(R.id.Card_Pass_Validity);
        btn = findViewById(R.id.sign_out);

        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).build();
        gsc = GoogleSignIn.getClient(this,gso);
      //  AccessToken accessToken = AccessToken.getCurrentAccessToken();

//        GraphRequest request = GraphRequest.newMeRequest(
//                accessToken,
//                new GraphRequest.GraphJSONObjectCallback() {
//                    @Override
//                    public void onCompleted(
//                            JSONObject object,
//                            GraphResponse response) {
//                        try {
//                            String fullName = object.getString("name");
//
//                        } catch (JSONException e) {
//                          e.printStackTrace();
//                        }
//                    }
//                });
//        Bundle parameters = new Bundle();
//        parameters.putString("fields", "id,name,link");
//        request.setParameters(parameters);
//        request.executeAsync();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signout();
                LoginManager.getInstance().logOut();
                startActivity(new Intent(HomePage.this, login.class));
                finish();
            }
        });

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
                Intent intent=new Intent(HomePage.this,Location.class);
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
    void signout()
    {
        gsc.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                finish();
                startActivity(new Intent(HomePage.this,login.class));
            }
        });

    }



}
