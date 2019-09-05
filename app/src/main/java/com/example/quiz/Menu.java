package com.example.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    TextView gk,sports,bollywood,politics,geography,physics,chemistry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        gk=findViewById(R.id.gk);
        sports=findViewById(R.id.sports);
        bollywood=findViewById(R.id.bollywood);
        politics=findViewById(R.id.politics);
        geography=findViewById(R.id.geography);
        physics=findViewById(R.id.physics);
        chemistry=findViewById(R.id.chemistry);

        gk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),sports_quiz.class);
                startActivity(i);
            }
        });

        bollywood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),bollywood_quiz.class);
                startActivity(i);
            }
        });

        politics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),politics_quiz.class);
                startActivity(i);
            }
        });

        geography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),geography_quiz.class);
                startActivity(i);
            }
        });

        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),physics_quiz.class);
                startActivity(i);
            }
        });

        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),chemistry_quiz.class);
                startActivity(i);
            }
        });

    }
}
