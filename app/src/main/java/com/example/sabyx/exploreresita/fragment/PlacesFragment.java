package com.example.sabyx.exploreresita.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.sabyx.exploreresita.R;
import com.example.sabyx.exploreresita.Location;
import com.example.sabyx.exploreresita.LocationAdapter;

import java.util.ArrayList;

public class PlacesFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getActivity().getResources().getString(R.string.pl1_title),getActivity().getResources().getString(R.string.pl1_desc), R.drawable.gradina_zoologica, 0,false));
        locations.add(new Location(getActivity().getResources().getString(R.string.pl2_title),getActivity().getResources().getString(R.string.pl2_desc), R.drawable.centru_civic, 0, false));
        locations.add(new Location(getActivity().getResources().getString(R.string.pl3_title),getActivity().getResources().getString(R.string.pl3_desc), R.drawable.muncitoresc, 0, false));

        LocationAdapter adapter = new LocationAdapter(getActivity(),0, locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
