package com.example.cupcake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Signup_Activity extends AppCompatActivity {

    TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_);

        getSupportActionBar().setTitle("Sign Up");


        login = findViewById(R.id.backlogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Signup_Activity.this, "Log In has been clicked", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(Signup_Activity.this, Signin_Activity.class);
                startActivity(intent);
            }
        });
    }
}