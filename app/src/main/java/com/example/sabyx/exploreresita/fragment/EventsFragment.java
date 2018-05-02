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

public class EventsFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getActivity().getResources().getString(R.string.ev1_title),getActivity().getResources().getString(R.string.ev1_desc), R.drawable.alergand, R.drawable.event, true));
        locations.add(new Location(getActivity().getResources().getString(R.string.ev2_title),getActivity().getResources().getString(R.string.ev2_desc), R.drawable.alai, R.drawable.event, true));
        locations.add(new Location(getActivity().getResources().getString(R.string.ev3_title),getActivity().getResources().getString(R.string.ev3_desc), R.drawable.garana, R.drawable.event, true));
        locations.add(new Location(getActivity().getResources().getString(R.string.ev4_title),getActivity().getResources().getString(R.string.ev4_desc), R.drawable.scena_ca_o_strada, R.drawable.event, true));

        LocationAdapter adapter = new LocationAdapter(getActivity(),0, locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
