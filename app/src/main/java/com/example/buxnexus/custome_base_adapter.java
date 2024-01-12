package com.example.buxnexus;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.buxnexus.R;

public class custome_base_adapter extends BaseAdapter {

    Context context;
    String listCon[];
    int listImages[];
    String descCon[];
    LayoutInflater inflater;

    custome_base_adapter(Context ctx, String[] Con_list, int[] Con_images, String[] Con_desc){

    this.context=ctx;
    this.listCon=Con_list;
    this.listImages=Con_images;
    this.descCon=Con_desc;
    inflater=LayoutInflater.from(ctx);
    }
    @Override
    public int getCount() {
        return listCon.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView=inflater.inflate(R.layout.activity_custome_list_view,null);
        TextView name=(TextView) convertView.findViewById(R.id.Name);
        TextView desc=(TextView) convertView.findViewById(R.id.Description);
        ImageView ConImg=(ImageView) convertView.findViewById(R.id.imageIcon);

        name.setText(listCon[position]);
        desc.setText(descCon[position]);
        ConImg.setImageResource(listImages[position]);

        return convertView;
    }
}
