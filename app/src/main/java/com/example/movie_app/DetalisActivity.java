package com.example.movie_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;


public class DetalisActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalis);



        VideoView videoView = (VideoView)findViewById(R.id.videoView);




        String uriraw = "android.resource://com.example.movie_app/"+R.raw.awy;
        Uri uri = Uri.parse(uriraw);
        videoView.setVideoURI(uri);
        videoView.setMediaController(new MediaController(this));
        videoView.requestFocus();
        videoView.start();

        Intent intent = getIntent();
        String result = intent.getStringExtra("name");
        Toast.makeText(DetalisActivity.this,result,Toast.LENGTH_LONG).show();
    }
}
