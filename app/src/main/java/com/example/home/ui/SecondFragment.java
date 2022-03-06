package com.example.home.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.home.MainAdapter;
import com.example.home.Model;
import com.example.home.R;
import com.example.home.SecondAdaptor;
import com.example.home.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;
    ArrayList<Model>arrayLists = new ArrayList<>();
    private SecondAdaptor adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(LayoutInflater.from(requireContext()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new SecondAdaptor(arrayLists);
        binding.recyclerFollow.setAdapter(adapter);
    }

    private void loadData() {
        arrayLists = new ArrayList<>();
       arrayLists.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg","" +
               " Nurik Liked photo","https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg"));
        arrayLists.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg","" +
                " Nurik Liked photo","https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg"));
        arrayLists.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg","" +
                " Nurik Liked photo","https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg"));
        arrayLists.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg","" +
                " Nurik Liked photo","https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg"));
        arrayLists.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg","" +
                " Nurik Liked photo","https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg"));
        arrayLists.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg","" +
                " Nurik Liked photo","https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg"));
}
}