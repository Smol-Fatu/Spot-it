package com.fatimamustafa.i200564;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class CameraPhotos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_photos); // Replace with your layout XML file

        ImageView crosshair = findViewById(R.id.crosshair);
        ImageView brightnessIcon = findViewById(R.id.brightness_icon);
        ImageView timerIcon = findViewById(R.id.timer_icon);
        ImageView galleryIcon = findViewById(R.id.gallery_icon);
        ImageView captureIcon = findViewById(R.id.capture_icon);
        ImageView rotateIcon = findViewById(R.id.rotate_icon);
        Button photoButton = findViewById(R.id.photo);
        Button videoButton = findViewById(R.id.video);

        crosshair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CameraPhotos.this,itemsmain.class);
                startActivity(intent);
            }
        });

        brightnessIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        timerIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        galleryIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        captureIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        rotateIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        photoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CameraPhotos.this,CameraPhotos.class);
                startActivity(intent);
            }
        });

        videoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CameraPhotos.this,CameraVideo.class);
                startActivity(intent);
            }
        });
    }
}
