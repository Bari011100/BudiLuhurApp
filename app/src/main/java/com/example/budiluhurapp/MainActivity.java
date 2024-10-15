package com.example.budiluhurapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

        private EditText fullname, username, email, password, mobile;
        private RadioGroup genderGroup;
        private RadioButton selectGender;
        private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        fullname = findViewById(R.id.txt_fullname);
        username = findViewById(R.id.txt_username);
        email = findViewById(R.id.txt_email);
        password = findViewById(R.id.txt_password);
        mobile = findViewById(R.id.txt_phone);
        genderGroup = findViewById(R.id.RGgroup);
        saveButton = findViewById(R.id.saveButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedGenderId = genderGroup.getCheckedRadioButtonId();
                selectGender = findViewById(selectedGenderId);

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("fullname",fullname.getText().toString());
                intent.putExtra("username",username.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("password",password.getText().toString());
                intent.putExtra("mobile",mobile.getText().toString());
                intent.putExtra("gender",selectGender.getText().toString());

                startActivity(intent);
            }
        });
    }
}