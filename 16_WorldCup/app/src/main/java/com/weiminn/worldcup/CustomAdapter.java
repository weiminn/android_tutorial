package com.weiminn.worldcup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<CountryModel> {

    private Context context;
    private ArrayList<CountryModel> countries;

    public CustomAdapter(ArrayList<CountryModel> countries, Context context) {
        super(context, R.layout.list_item_better, countries);
        this.countries = countries;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        CountryModel country = getItem(position);

        ViewHolder viewHolder;
        if (convertView == null){
            viewHolder = new ViewHolder();

            // dynamically create view
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.list_item_better,
                    parent,
                    false);

            convertView.setTag(viewHolder);
            viewHolder.countryName = (TextView) convertView.findViewById(R.id.countryName);
            viewHolder.cupWinCount = (TextView) convertView.findViewById(R.id.cupWinDesc);
            viewHolder.flag = (ImageView) convertView.findViewById(R.id.flag);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.countryName.setText(country.getCountryName());
        viewHolder.cupWinCount.setText(country.getCupWinCount());
        viewHolder.flag.setImageResource(country.getFlag_img());

        return convertView;
    }

    static class ViewHolder {
        TextView countryName, cupWinCount;
        ImageView flag;

    }
}
