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
import com.example.home.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;
    ArrayList<Model>arrayLists = new ArrayList<>();
    private MainAdapter adapter;

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
        adapter = new MainAdapter(arrayLists);
        binding.recyclerFollow.setAdapter(adapter);
    }

    private void loadData() {
        arrayLists = new ArrayList<>();
        arrayLists.add(new Model("https://icdn" +
                ".lenta.ru/images/2021/08/12/11/20210812115738455/square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg",
                "Mark Levinson liked to your picture",
                "https://icdn" +
                        ".lenta.ru/images/2021/08/12/11/20210812115738455/square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg"));
        arrayLists.add(new Model("https://icdn" +
                ".lenta.ru/images/2021/08/12/11/20210812115738455/square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg",
                "Mark Levinson liked to your picture",
                "https://icdn" +
                        ".lenta.ru/images/2021/08/12/11/20210812115738455/square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg"));
        arrayLists.add(new Model("https://icdn" +
                ".lenta.ru/images/2021/08/12/11/20210812115738455/square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg",
                "Mark Levinson liked to your picture",
                "https://icdn" +
                        ".lenta.ru/images/2021/08/12/11/20210812115738455/square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg"));
        arrayLists.add(new Model("https://icdn" +
                ".lenta.ru/images/2021/08/12/11/20210812115738455/square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg",
                "Mark Levinson liked to your picture",
                "https://icdn" +
                        ".lenta.ru/images/2021/08/12/11/20210812115738455/square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg"));
        arrayLists.add(new Model("https://icdn" +
                ".lenta.ru/images/2021/08/12/11/20210812115738455/square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg",
                "Mark Levinson liked to your picture",
                "https://icdn" +
                        ".lenta.ru/images/2021/08/12/11/20210812115738455/square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg"));
}
}