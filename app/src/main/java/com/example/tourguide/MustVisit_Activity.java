package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toolbar;

import android.app.LauncherActivity;
import android.os.Bundle;
import android.provider.UserDictionary;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MustVisit_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_must_visit);



        ArrayList<Format> mustvisitplaces =new ArrayList<>();
        mustvisitplaces.add(new Format("1.", "Sabarmati Aashram", R.drawable.aashram));
        mustvisitplaces.add(new Format("2.", "Kankaria Lake", R.drawable.kankaria ));
        mustvisitplaces.add(new Format("3.", "The Adalaj Step-Well", R.drawable.adalaj));
        mustvisitplaces.add(new Format("4.", "Sidi Saiyyed Mosque", R.drawable.sidisaiyyed));
        mustvisitplaces.add(new Format("5.", "Sabarmati Riverfront", R.drawable.riverfront));
        mustvisitplaces.add(new Format("6.", "ISCON Temple", R.drawable.iscon));
        mustvisitplaces.add(new Format("7.", "Parimal Garden", R.drawable.parimal));

        FormatAdapter adapter = new FormatAdapter(this, mustvisitplaces);

        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

    }
}