package com.example.viewpager;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Status_frag extends Fragment {
    RecyclerView recyclerView;
    ArrayList<String> name;

    public Status_frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_status_frag, container, false);
        recyclerView=root.findViewById(R.id.rview_chats);
      int[]image={R.drawable.abc,R.drawable.ammu,R.drawable.eva,R.drawable.fhgg};
        name=new ArrayList<>();
        name.add("Eva");
        name.add("Emaya");
        name.add("Aidu");
        name.add("Evan");
        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new Adapter(getContext(),name,image));
        return root;


    }

}
