package com.example.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.home.databinding.FragmentSecondBinding;
import com.example.home.databinding.FragmentTabLBinding;

import java.util.ArrayList;


public class TabLFragment extends Fragment {
    private FragmentTabLBinding binding;
    private ThrideAdaptor adaptor;
    private ArrayList<Model> models;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentTabLBinding.inflate(LayoutInflater.from(requireContext()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adaptor = new ThrideAdaptor(models);
        binding.recyclerJacob.setAdapter(adaptor);

    }

    private void loadData() {
        models = new ArrayList<>();
        models.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg"));
        models.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg"));
        models.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg"));
        models.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg"));
        models.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg"));
        models.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg"));
        models.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg"));
        models.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg"));
        models.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg"));
        models.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg"));
    }
}