package com.example.movie_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class DetalisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalis);

        Intent intent = getIntent();
        String result = intent.getStringExtra("name");
        Toast.makeText(DetalisActivity.this,result,Toast.LENGTH_LONG).show();
    }
}
