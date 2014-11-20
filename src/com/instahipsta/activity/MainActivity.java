package com.instahipsta.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.instahipsta.R;
import com.instahipsta.login.LoginScreen;

public class MainActivity extends Activity {

    private EditText nameField;
    private EditText passwordField;
    private LoginScreen login;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        init();
    }

    public void init(){
        nameField = (EditText) findViewById(R.id.name);
        passwordField = (EditText) findViewById(R.id.password);
        login = new LoginScreen();
    }

    public void onLoginClick(View view) {
        login.registerUser(nameField.getText().toString(), passwordField.getText().toString());
        Intent fire = new Intent(MainActivity.this, Home.class);
        startActivity(fire);
    }
}