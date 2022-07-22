package com.leul.onelist;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class customarrayaddapter extends ArrayAdapter {
    String [] names;
    String [] roles;
    Integer [] images;
    Activity context;
    public customarrayaddapter(Activity context,String [] name,String []  role,Integer [] image){
        super(context,R.layout.custom_list_item,name);
        this.context=context;
        this.names=name;
        this.roles=role;
        this.images=image;
    }

    public View getView(int position,View view,ViewGroup parent) {
        View row=view;
        LayoutInflater inflater=context.getLayoutInflater();
        if(row==null)
            row=inflater.inflate(R.layout.custom_list_item,null,true);
        TextView tvName=row.findViewById(R.id.textView1);
        TextView tvRole=row.findViewById(R.id.textView2);
        ImageView imageView=row.findViewById(R.id.imageView);

        tvName.setText(names[position]);
        tvRole.setText(roles[position]);
        imageView.setImageResource(images[position]);

        return row;
    }
}
