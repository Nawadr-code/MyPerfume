package com.example.android.myperfumeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
  Button about,call,work;
  ImageView one,two;
  TextView time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        about=findViewById(R.id.about);
        call=findViewById(R.id.callus);
        work=findViewById(R.id.workhourse);
one=findViewById(R.id.simpleImageView1);
time=findViewById(R.id.timee);
Date cc= Calendar.getInstance().getTime();
time.setText(cc.toString());
        two=findViewById(R.id.simpleImageView2);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchActivityIntent = new Intent(getApplicationContext(), About.class);
                startActivity(switchActivityIntent);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0987654321"));
                startActivity(intent);
            }
        });

        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"you should click a long press on button!",Toast.LENGTH_LONG).show();

            }
        });
        work.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                Intent switchActivityIntent1 = new Intent(getApplicationContext(), WorkHourae.class);
                startActivity(switchActivityIntent1);
                return false;
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchActivityIntent1 = new Intent(getApplicationContext(), one.class);
                startActivity(switchActivityIntent1);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchActivityIntent1 = new Intent(getApplicationContext(), two.class);
                startActivity(switchActivityIntent1);
            }
        });
    }
}