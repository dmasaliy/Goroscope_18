package com.example.goroscope;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class InfoActivity extends AppCompatActivity {
    TextView infoView;

    String info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        infoView = findViewById(R.id.infoView);

        info = Objects.requireNonNull(getIntent().getExtras()).getString("goroskcope");


        infoView.setText(info);
    }

}