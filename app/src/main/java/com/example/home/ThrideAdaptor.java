package com.example.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.home.databinding.ItemthreeBinding;

import java.util.ArrayList;

public class ThrideAdaptor extends RecyclerView.Adapter<ThrideAdaptor.ViewHolder> {
    private ItemthreeBinding binding;
    ArrayList<Model> nol = new ArrayList<>();


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemthreeBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }
    public ThrideAdaptor(ArrayList<Model> aray) {
        this.nol = aray;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.bind(nol.get(position));
    }

    @Override
    public int getItemCount() {
        return nol.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private ItemthreeBinding binding;

        public ViewHolder(@NonNull ItemthreeBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Model model) {
            Glide.with(binding.imageImage).load(model.getPhoto()).into(binding.imageImage);
        }
    }
    }

