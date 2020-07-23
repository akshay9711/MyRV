package com.example.myrv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> modelClassList;

    public Adapter(List<ModelClass> modelClassList) {
        this.modelClassList = modelClassList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int resource = modelClassList.get(position).getImageResource();
        String title = modelClassList.get(position).getTitle();

        holder.saveData(resource, title);
    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    //ViewHolder class
    class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView title;

        //Constructor of ViewHolder
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.profileImg);
            title = itemView.findViewById(R.id.nameTextView);
        }
        public void saveData(int resource, String titleText){
            imageView.setImageResource(resource);
            title.setText(titleText);
        }
    }
}
