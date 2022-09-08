package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        ArrayList<Format> mustvisitplaces =new ArrayList<>();
        mustvisitplaces.add(new Format("1.", "Rajwadu", R.drawable.rajwadu));
        mustvisitplaces.add(new Format("2.", "Barbeque Nation", R.drawable.barbeque ));
        mustvisitplaces.add(new Format("3.", "Gordhan Thal", R.drawable.gordhan));
        mustvisitplaces.add(new Format("4.", "Vishala", R.drawable.vishala));
        mustvisitplaces.add(new Format("5.", "Mango", R.drawable.mango));
        mustvisitplaces.add(new Format("6.", "Sankalp", R.drawable.sankalp));
        mustvisitplaces.add(new Format("7.", "Mexicano-By-The-Bay", R.drawable.mexicano));

        FormatAdapter adapter = new FormatAdapter(this, mustvisitplaces);

        ListView list = (ListView) findViewById(R.id.list2);
        list.setAdapter(adapter);
    }
}