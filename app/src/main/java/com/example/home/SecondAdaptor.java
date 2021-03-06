package com.example.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.home.databinding.ItemtwoBinding;

import java.util.ArrayList;

public class SecondAdaptor extends RecyclerView.Adapter<SecondAdaptor.ViewHolder> {
    private ItemtwoBinding binding;
    ArrayList<Model> modelss = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemtwoBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }
    public SecondAdaptor(ArrayList<Model> modelss) {
        this.modelss = modelss;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.bind(modelss.get(position));
    }

    @Override
    public int getItemCount() {
        return modelss.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private ItemtwoBinding binding;

        public ViewHolder(@NonNull ItemtwoBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }



        public void bind(Model model) {
            Glide.with(binding.picLog).load(model.getPhoto()).circleCrop().into(binding.picLog);
            Glide.with(binding.imageSeclog).load(model.getImageProfile()).into(binding.imageSeclog);
            binding.textLog.setText(model.getTextPost());
        }
    }
}
