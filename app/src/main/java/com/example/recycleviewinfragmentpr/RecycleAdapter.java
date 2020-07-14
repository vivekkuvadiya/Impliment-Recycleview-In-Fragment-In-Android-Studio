package com.example.recycleviewinfragmentpr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.RecycleHolder> {

    List<DataModel> list;
    Context context;
    LayoutInflater inflater;

    public RecycleAdapter(List<DataModel> list, Context context) {
        this.list = list;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecycleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.recycle_item,parent,false);

        return new RecycleHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleHolder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.textView.setText(list.get(position).getText());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class RecycleHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;


        public RecycleHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.img_id);
            textView = itemView.findViewById(R.id.txt_id);

        }
    }

}
