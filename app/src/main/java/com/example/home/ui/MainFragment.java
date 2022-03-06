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
import com.example.home.databinding.FragmentMainBinding;

import java.util.ArrayList;


public class MainFragment extends Fragment {
    private FragmentMainBinding binding;
    ArrayList<Model> arrayList = new ArrayList<>();
    private MainAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new MainAdapter(arrayList);
        binding.recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        arrayList = new ArrayList<>();
        arrayList.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg","I like this car!"));
        arrayList.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg","I like this car!"));
        arrayList.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg","I like this car!"));
        arrayList.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg","I like this car!"));
        arrayList.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg","I like this car!"));
        arrayList.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg","I like this car!"));
        arrayList.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg","I like this car!"));
        arrayList.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg","I like this car!"));
        arrayList.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg","I like this car!"));
        arrayList.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg","I like this car!"));
        arrayList.add(new Model("https://s3.amazonaws.com/the-drive-staging/message-editor%2F1528475104876-1-bmwi8.jpg","I like this car!"));
    }
}
