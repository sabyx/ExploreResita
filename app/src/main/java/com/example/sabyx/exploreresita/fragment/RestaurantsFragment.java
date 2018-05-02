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

public class RestaurantsFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getActivity().getResources().getString(R.string.re1_title),getActivity().getResources().getString(R.string.re1_desc), R.drawable.motif, R.drawable.restaurant_icon, true));
        locations.add(new Location(getActivity().getResources().getString(R.string.re2_title),getActivity().getResources().getString(R.string.re2_desc), R.drawable.capriccio, R.drawable.restaurant_icon, true));
        locations.add(new Location(getActivity().getResources().getString(R.string.re3_title),getActivity().getResources().getString(R.string.re3_desc), R.drawable.restaurant_800, R.drawable.restaurant_icon, true));
        locations.add(new Location(getActivity().getResources().getString(R.string.re4_title),getActivity().getResources().getString(R.string.re4_desc), R.drawable.rogge, R.drawable.restaurant_icon, true));

        LocationAdapter adapter = new LocationAdapter(getActivity(),0, locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
