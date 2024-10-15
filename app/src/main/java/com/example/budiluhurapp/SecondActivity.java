package com.example.budiluhurapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
        private TextView textViewResult;
        private Button buttonback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        textViewResult = findViewById(R.id.textViewResult);
        buttonback = findViewById(R.id.back);

        String fullname = getIntent().getStringExtra("fullname");
        String username = getIntent().getStringExtra("username");
        String email = getIntent().getStringExtra("email");
        String password = getIntent().getStringExtra("password");
        String mobile = getIntent().getStringExtra("mobile");
        String gender = getIntent().getStringExtra("gender");

        String result = "Full Name: " + fullname + "\n" +
                "User Name: " + username + "\n" +
                "Email: " + email + "\n" +
                "Password: " + password + "\n" +
                "Mobile: " + mobile + "\n" +
                "Gender: " + gender;


        textViewResult.setText(result);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}