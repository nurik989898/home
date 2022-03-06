package com.example.home.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.home.MainAdapter;
import com.example.home.Model;
import com.example.home.databinding.FragmentMainBinding;

import java.util.ArrayList;


public class MainFragment extends Fragment {
    private FragmentMainBinding binding;
    ArrayList<Model>arrayList = new ArrayList<>();
    private MainAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = FragmentMainBinding.inflate(LayoutInflater.from(requireContext()),container,false);
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
        arrayList.add(new Model("https://icdn" +
                ".lenta.ru/images/2021/08/12/11/20210812115738455/square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg","This hot!"));
        arrayList.add(new Model("https://icdn" +
                ".lenta.ru/images/2021/08/12/11/20210812115738455/" +
                "square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg","This hot!"));
        arrayList.add(new Model("https://icdn" +
                ".lenta.ru/images/2021/08/12/11/20210812115738455/" +
                "square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg","This hot!"));
        arrayList.add(new Model("https://icdn" +
                ".lenta.ru/images/2021/08/12/11/20210812115738455/" +
                "square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg","This hot!"));
        arrayList.add(new Model("https://icdn" +
                ".lenta.ru/images/2021/08/12/11/20210812115738455/" +
                "square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg","This hot!"));
        arrayList.add(new Model("https://icdn" +
                ".lenta.ru/images/2021/08/12/11/20210812115738455/" +
                "square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg","This hot!"));
        arrayList.add(new Model("https://icdn" +
                ".lenta.ru/images/2021/08/12/11/20210812115738455/" +
                "square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg","This hot!"));
        arrayList.add(new Model("https://icdn" +
                ".lenta.ru/images/2021/08/12/11/20210812115738455/" +
                "square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg","This hot!"));
        arrayList.add(new Model("https://icdn" +
                ".lenta.ru/images/2021/08/12/11/20210812115738455/" +
                "square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg","This hot!"));
        arrayList.add(new Model("https://icdn" +
                ".lenta.ru/images/2021/08/12/11/20210812115738455/" +
                "square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg","This hot!"));
    }
}