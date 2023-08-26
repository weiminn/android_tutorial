package com.weiminn.planets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Planet> {

    private ArrayList<Planet> planetsArrayList;
    Context context; // stores the reference to the instance of the caller

    public MyCustomAdapter(ArrayList<Planet> planetsArrayList, Context context) {
        super(context, R.layout.item_list_layout, planetsArrayList);
        this.planetsArrayList = planetsArrayList;
        this.context = context;
    }

    private static class MyViewHolder {
        TextView planetName;
        TextView moonCount;
        ImageView plantImg;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // inherited getItem method that retrieves by postion index
        Planet planet = getItem(position);

        MyViewHolder myViewHolder;
        final View result;

        if(convertView == null){
            myViewHolder = new MyViewHolder();
            // LayoutInflater inflater = LayoutInflater.from(getContext());
            // getContext retrieves the context of the activity the view is in
            LayoutInflater inflater = LayoutInflater.from(this.context);
            convertView = inflater.inflate(
                    R.layout.item_list_layout, // which xml you want to inflate
                    parent, // layout parameters for inflation
                    false // don't attach to parent right away
            );
            myViewHolder.planetName = (TextView) convertView.findViewById(R.id.planetName);
            myViewHolder.moonCount = (TextView) convertView.findViewById(R.id.moons);
            myViewHolder.plantImg = (ImageView) convertView.findViewById(R.id.imageView);

            result = convertView;

            // store the viewholder instance inside the view for later
            convertView.setTag(myViewHolder);
        } else {
            // retrieve the viewholder instance stored inside the view
            myViewHolder = (MyViewHolder) convertView.getTag();
            result = convertView;
        }

        myViewHolder.planetName.setText(planet.getPlanetName());
        myViewHolder.moonCount.setText(planet.getMoonCount() + "");
        myViewHolder.plantImg.setImageResource(planet.getPlanetImage());

        return convertView;
    }
}