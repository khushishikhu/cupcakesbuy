package com.example.cupcake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Signin_Activity extends AppCompatActivity {

    TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_);

        getSupportActionBar().setTitle("Sign In");


        register = findViewById(R.id.backlogin);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Signin_Activity.this, " Register has been clicked", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(Signin_Activity.this, Signup_Activity.class);
                startActivity(intent);
            }
        });

    }
}