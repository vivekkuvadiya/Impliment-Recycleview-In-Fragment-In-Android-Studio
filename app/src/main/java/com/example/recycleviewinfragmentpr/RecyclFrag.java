package com.example.recycleviewinfragmentpr;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class RecyclFrag extends Fragment {

    RecyclerView recyclerView;
    ArrayList<DataModel> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycl,container,false);

        recyclerView = view.findViewById(R.id.recyclerView);

        dataModelList();

        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(manager);

        RecycleAdapter adapter = new RecycleAdapter(list,getContext());

        recyclerView.setAdapter(adapter);

        return view;
    }


    private void dataModelList(){

        list = new ArrayList<>();
        list.add(new DataModel(R.drawable.insta,getString(R.string.instagram_logo)));
        list.add(new DataModel(R.drawable.insta,getString(R.string.instagram_logo)));
        list.add(new DataModel(R.drawable.insta,getString(R.string.instagram_logo)));
        list.add(new DataModel(R.drawable.insta,getString(R.string.instagram_logo)));
        list.add(new DataModel(R.drawable.insta,getString(R.string.instagram_logo)));
        list.add(new DataModel(R.drawable.insta,getString(R.string.instagram_logo)));
        list.add(new DataModel(R.drawable.insta,getString(R.string.instagram_logo)));
        list.add(new DataModel(R.drawable.insta,getString(R.string.instagram_logo)));
        list.add(new DataModel(R.drawable.insta,getString(R.string.instagram_logo)));
        list.add(new DataModel(R.drawable.insta,getString(R.string.instagram_logo)));
        list.add(new DataModel(R.drawable.insta,getString(R.string.instagram_logo)));
        list.add(new DataModel(R.drawable.insta,getString(R.string.instagram_logo)));
        list.add(new DataModel(R.drawable.insta,getString(R.string.instagram_logo)));
        list.add(new DataModel(R.drawable.insta,getString(R.string.instagram_logo)));
        list.add(new DataModel(R.drawable.insta,getString(R.string.instagram_logo)));

    }

}
