package com.example.viewpager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class Tab_Adapter extends FragmentStatePagerAdapter {
    private final List<Fragment> Frag_List = new ArrayList<>();
    private final List<String> Fragment_Title_List = new ArrayList<>();

    public Tab_Adapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return Frag_List.get(position);
    }
    public void addFragment(Fragment fragment, String title) {
        Frag_List.add(fragment);
        Fragment_Title_List.add(title);
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return Fragment_Title_List.get(position);
    }

    @Override
    public int getCount() {
        return Frag_List.size();
    }
}
