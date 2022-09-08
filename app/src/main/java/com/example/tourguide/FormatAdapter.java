package com.example.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.Normalizer;
import java.util.ArrayList;

public class FormatAdapter extends ArrayAdapter<Format> {

    public FormatAdapter(Activity context, ArrayList<Format> Format){
        super(context, 0, Format);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listitemView = convertView;
        if (listitemView==null){
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Format current = getItem(position);


        TextView sequence_number =(TextView)listitemView.findViewById(R.id.sequence_number);
        sequence_number.setText(current.getNumber());

        TextView place_name = (TextView) listitemView.findViewById(R.id.place_name);
        place_name.setText(current.getPlace_Name());

        ImageView image = (ImageView) listitemView.findViewById(R.id.imageView);
        image.setImageResource(current.getImageResourceID());

        return listitemView;
    }
}
