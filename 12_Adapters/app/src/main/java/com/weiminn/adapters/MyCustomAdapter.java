package com.weiminn.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyCustomAdapter extends BaseAdapter {

    // object that provides access to various resources and services from the android OS
    private Context context;

    private String[] items;

    public MyCustomAdapter(Context context, String[] items){
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        // create reference to the item
        ViewHolder holder;

        // convertView is a recycled View that you can reuse to improve the performance of your list
        // eg: when a view is scrolled off screen, it can be recycled to render a new tiem
        if (convertView == null){

            // dynamically create a view item via java from another atomic xml,
            // instead of statically listing them in main.xml
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.custom_list_item, viewGroup, false);
            holder = new ViewHolder();
            holder.textView = convertView.findViewById(R.id.text1);
            convertView.setTag(holder);
        } else { // if the view is recycled aka currently holding reference
            // retrieve previously associated ViewHolder object
            holder = (ViewHolder) convertView.getTag();
        }

        holder.textView.setText(items[i]);

        return convertView;
    }

    // reference to the list item
    static class ViewHolder {
        // if you have a text view in the list item, you have to create TextView attribute here
        TextView textView;
    }
}
