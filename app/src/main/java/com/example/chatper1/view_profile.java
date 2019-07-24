package com.example.chatper1;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class view_profile extends AppCompatActivity {
Button button;
TextView textView;
boolean clicked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);
        button = findViewById(R.id.button2);
        textView = findViewById(R.id.followersCounterTextView);
        clicked = false;
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (!clicked)
                {
                    textView.setText("26 \n followers");
                    clicked = true;
                    button.setText("Following");
                }
            }
        });
    }
}
