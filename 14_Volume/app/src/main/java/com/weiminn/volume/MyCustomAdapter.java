package com.weiminn.volume;

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
import java.util.zip.Inflater;

public class MyCustomAdapter extends ArrayAdapter<Shape> {

    private ArrayList<Shape> shapesArrayList;
    Context context;

    public MyCustomAdapter(ArrayList<Shape> shapesArrayList, Context context) {
        super(context, R.layout.grid_item, shapesArrayList);
        this.shapesArrayList = shapesArrayList;
        this.context = context;
    }

    private static class MyViewHolder {
        TextView shapeName;
        ImageView shapeImg;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // this.context, getContext() and parent.getContext() are the same!

        //naive way
//        View item = LayoutInflater.from(getContext())
//        View item = LayoutInflater.from(this.context)
//        View item = LayoutInflater.from(parent.getContext())
        View item = LayoutInflater.from(this.context.getApplicationContext())
                .inflate(R.layout.grid_item, parent, false);
        ((TextView) item.findViewById(R.id.textView)).setText(getItem(position).getShapeName());
        ((ImageView) item.findViewById(R.id.imageView)).setImageResource(this.shapesArrayList.get(position).getShapeImg());
        return item;
    }
}
