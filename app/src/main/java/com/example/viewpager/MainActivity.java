package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tab_);
        viewPager=findViewById(R.id.view_);

        Tab_Adapter tab_adapter=new Tab_Adapter(getSupportFragmentManager());
        tab_adapter.addFragment(new Chats_frag(),"Chats");
        tab_adapter.addFragment(new Status_frag(),"Status");
        tab_adapter.addFragment(new Calls_frag(),"Calls");
        viewPager.setAdapter(tab_adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
