package com.example.mypracticeinterface;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class activity_profile extends AppCompatActivity {

    private TextView textName, textFatherName, textCnic, textRegNo;
    private ImageView profileImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Initialize views
        profileImage = findViewById(R.id.profileImage);
        textName = findViewById(R.id.textName);
        textFatherName = findViewById(R.id.textFatherName);
        textCnic = findViewById(R.id.textCnic);
        textRegNo = findViewById(R.id.textRegNo);

        // Get data from Intent
        String name = getIntent().getStringExtra("STUDENT_NAME");
        String fatherName = getIntent().getStringExtra("FATHER_NAME");
        String fatherCnic = getIntent().getStringExtra("FATHER_CNIC");
        String regNumber = getIntent().getStringExtra("REG_NUMBER");
        String imageUri = getIntent().getStringExtra("IMAGE_URI");

        // Set data to views
        textName.setText(name);
        textFatherName.setText(fatherName);
        textCnic.setText(fatherCnic);
        textRegNo.setText(regNumber);
        // Set profile image if needed
        profileImage.setImageURI(Uri.parse(imageUri)); // If you have a URI
    }
}