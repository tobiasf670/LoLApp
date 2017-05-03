package com.example.tobias.lolapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    EditText password,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText)findViewById(R.id.input_email);
        email.setHint("E-Mail");

        password = (EditText)findViewById(R.id.input_password);
        password.setHint("Password");

    }
}
