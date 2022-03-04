package com.example.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.example.home.databinding.ActivityMainBinding;
import com.example.home.ui.MainFragment;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        NavController navController = Navigation.findNavController(this,R.id.NavHost_fragment);
        NavigationUI.setupWithNavController(binding.BottomNavigation,navController);
        getSupportFragmentManager().beginTransaction().add(R.id.NavHost_fragment, new MainFragment()).commit();
    }
}