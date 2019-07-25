package com.example.chatper1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class UpdateProfile extends AppCompatActivity {
    Button change_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);
        change_password = findViewById(R.id.ChangePassword);
        Intent intent = new Intent(UpdateProfile.this, ChangePassword.class);
        startActivity(intent);
    }
}
