package com.example.home;

import androidx.fragment.app.Fragment;

public class ModelTabs {
    private Fragment fragment;
    private Integer icon;

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public Integer getIcon() {
        return icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    public ModelTabs(Fragment fragment, Integer icon) {
        this.fragment = fragment;
        this.icon = icon;
    }
}
