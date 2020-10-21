package com.example.viewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class Adapter extends RecyclerView.Adapter<Adapter.Myvh> {
    public Adapter(Context context, ArrayList<String> name, int[] image) {
        this.context = context;
        this.name = name;
        this.image = image;
    }

    Context context;
   ArrayList<String> name;
   int[] image;
    @NonNull
    @Override
    public Myvh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View   view= LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item,parent,false);

        return new Myvh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myvh holder, int position) {
holder.image.setImageResource(image[position]);
holder.name.setText(name.get(position));

    }

    @Override
    public int getItemCount() {
        return name.size();
    }

    class Myvh extends RecyclerView.ViewHolder{
TextView name;
CircleImageView image;
        public Myvh(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name_list);
            image=itemView.findViewById(R.id.view_img);
        }
    }
}
