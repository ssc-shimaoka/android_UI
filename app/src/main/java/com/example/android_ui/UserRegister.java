package com.example.android_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register);
    }

    public void onClickUserRegisterOKButton(View view)
    {
        Intent intent = new Intent(UserRegister.this, UserRegister.class);
        startActivity(intent);
    }

    public void onClickUserRegisterCancelButton(View view)
    {
        finish();
    }
}
