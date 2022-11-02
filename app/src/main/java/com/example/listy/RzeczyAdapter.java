package com.example.listy;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class RzeczyAdapter extends ArrayAdapter<Rzeczy> {
    private Context mContext;
    private int mResource;
    public RzeczyAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Rzeczy> objects) {
        super(context, resource, objects);
        this.mContext=context;
        this.mResource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource,parent,false);
        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textView = convertView.findViewById(R.id.textView);
        imageView.setImageResource(getItem(position).getZdjecie());
        textView.setText(getItem(position).getTekst());
     convertView.setOnClickListener(
             new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     Intent intent = new Intent((Application)mContext,MainActivity2.class);
                 }
             }
     );

        return convertView;
    }
}
