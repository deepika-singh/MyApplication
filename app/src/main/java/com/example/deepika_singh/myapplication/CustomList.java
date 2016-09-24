package com.example.deepika_singh.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.deepika_singh.myapplication.R.id.item;

/**
 *
 */
public class CustomList extends ArrayAdapter<String> {
    private String[] names;
    private String[] desc;
    //private Integer[] imageid;
    private Activity context;

    public CustomList(Activity context, String[] names, String[] desc) {
        super(context, R.layout.list_layout, names);
        this.context = context;
        this.names = names;
        this.desc = desc;
        //this.imageid = imageid;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_layout, null, true);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.item);
        TextView textViewDesc = (TextView) listViewItem.findViewById(R.id.price);
        //ImageView image = (ImageView) listViewItem.findViewById(R.id.imageView);

        textViewName.setText(names[position]);
        textViewDesc.setText(desc[position]);
        //image.setImageResource(imageid[position]);
        return  listViewItem;
    }
}