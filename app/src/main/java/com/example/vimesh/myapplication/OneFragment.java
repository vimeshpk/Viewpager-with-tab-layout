package com.example.vimesh.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


public class OneFragment extends Fragment {

    ListView listView;
    List<Test> rowItems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        rowItems=new ArrayList<Test>();
        Test test= new Test();
        test.setName("ABC");
        rowItems.add(test);
        listView=(ListView)view.findViewById(R.id.listview);
        ListAdapter listAdapter=new ListAdapter(getActivity(),rowItems);
        listView.setAdapter(listAdapter);
        return  view;
    }


}
