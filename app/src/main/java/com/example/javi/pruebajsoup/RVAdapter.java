package com.example.javi.pruebajsoup;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Javi on 25/5/17.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.MyViewHolder> {

    ArrayList<Item> items;
    Context context;

    public RVAdapter(ArrayList<Item> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.cards_layout, parent);

        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {

        return items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView tvTitle;
        TextView tvDesc;
        ImageView imNews;

        public MyViewHolder(View itemView) {
            super(itemView);

            tvTitle = (TextView) itemView.findViewById(R.id.TvTitle);
            tvDesc = (TextView) itemView.findViewById(R.id.TvDesc);
            imNews = (ImageView) itemView.findViewById(R.id.ImgNews);

        }

        @Override
        public void onClick(View v) {

        }
    }
}
