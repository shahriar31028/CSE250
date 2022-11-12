package com.example.sight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inter_Activity extends AppCompatActivity {

    private Button postbtn, eventbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter_);

        postbtn = findViewById(R.id.button1);
        eventbtn = findViewById(R.id.button2);

        postbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(inter_Activity.this, PostActivity.class));
            }
        });

        eventbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(inter_Activity.this, EventActivity.class));
            }
        });
    }
}
