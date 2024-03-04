package com.example.homework;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class cardAdapter extends RecyclerView.Adapter<cardAdapter.MyViewHolder> {
    Context context;
    ArrayList<cardModel>models;

    public cardAdapter(Context context, ArrayList<cardModel> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public cardAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_layout,parent,false);
     return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull cardAdapter.MyViewHolder holder, int position) {
     holder.text.setText(models.get(position).name);
     holder.iv.setImageResource(models.get(position).image);


    }

    @Override
    public int getItemCount() {
        return models.size();
    }
    static public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        ImageView iv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            text =itemView.findViewById(R.id.textView);
            iv = itemView.findViewById(R.id.imageView);
        }
    }
}
