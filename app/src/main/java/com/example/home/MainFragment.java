package com.example.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.home.databinding.FragmentMainBinding;


public class MainFragment extends Fragment {
    private FragmentMainBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = FragmentMainBinding.inflate(LayoutInflater.from(requireContext()),container,false);
        return binding.getRoot();
    }
}