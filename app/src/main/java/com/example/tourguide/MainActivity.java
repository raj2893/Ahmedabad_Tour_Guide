package com.example.tourguide;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView MustVisit = (TextView) findViewById(R.id.mustvisit);
        TextView Restaurants = (TextView) findViewById(R.id.restaurants);


        MustVisit.setOnClickListener(view -> {
            Intent mustvisitIntent = new Intent(MainActivity.this, MustVisit_Activity.class);
            startActivity(mustvisitIntent);
        });

        Restaurants.setOnClickListener(View ->{
            Intent restaurantsIntent = new Intent(MainActivity.this, Restaurants.class);
            startActivity(restaurantsIntent);
        });


    }
}