package com.example.androidchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//private Button button;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button;
        Button link;
        

        link = findViewById(R.id.button1);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                browser();
            }
        });



        button =  findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                openProfile();

            }
            
        });    
    }
    public void openProfile() {
        Intent intent = new Intent (this, myProfile.class);
        startActivity(intent);
    }

    public void browser() {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://andela.com/alc/"));
       startActivity(browserIntent);
    }

}
