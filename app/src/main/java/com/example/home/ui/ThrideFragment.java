package com.example.home.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.home.Model;
import com.example.home.R;
import com.example.home.TabLFragment;
import com.example.home.ThrideAdaptor;
import com.example.home.databinding.FragmentThrideBinding;

import java.util.ArrayList;

public class ThrideFragment extends Fragment {
    private FragmentThrideBinding binding;
    ArrayList<Model> aray = new ArrayList<>();
    private ViewPagerAdapter viewPagerAdapter;
    ArrayList<Fragment> viewPagerFragment = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentThrideBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViewPager();
    }

    private void initViewPager() {
        viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager(), 0);
        viewPagerFragment.add(new TabLFragment());
        viewPagerFragment.add(new TabLFragment());
        viewPagerAdapter.setFragment(viewPagerFragment);
        binding.viewPagerone.setAdapter(viewPagerAdapter);
        binding.tabLo.setupWithViewPager(binding.viewPagerone);
        binding.tabLo.getTabAt(0).setIcon(R.drawable.ic_com);
        binding.tabLo.getTabAt(1).setIcon(R.drawable.ic_assignment);

    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private ArrayList<Fragment> fragment = new ArrayList<>();

        public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragment.get(position);
        }

        @Override
        public int getCount() {
            return fragment.size();
        }

        public void setFragment(ArrayList<Fragment> fragment) {
            this.fragment = fragment;
        }
    }
}