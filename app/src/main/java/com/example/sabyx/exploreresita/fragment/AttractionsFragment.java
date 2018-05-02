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

public class AttractionsFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getActivity().getResources().getString(R.string.at1_title),getActivity().getResources().getString(R.string.at1_desc), R.drawable.locomotive, R.drawable.attractions, true));
        locations.add(new Location(getActivity().getResources().getString(R.string.at2_title),getActivity().getResources().getString(R.string.at2_desc), R.drawable.muzeul_banatului_montan, R.drawable.attractions, true));
        locations.add(new Location(getActivity().getResources().getString(R.string.at3_title),getActivity().getResources().getString(R.string.at3_desc), R.drawable.cultural, R.drawable.attractions, true));
        locations.add(new Location(getActivity().getResources().getString(R.string.at4_title),getActivity().getResources().getString(R.string.at4_desc), R.drawable.fantana, R.drawable.attractions, true));
        locations.add(new Location(getActivity().getResources().getString(R.string.at5_title),getActivity().getResources().getString(R.string.at5_desc), R.drawable.sala_polivalenta, R.drawable.attractions, true));
        locations.add(new Location(getActivity().getResources().getString(R.string.at6_title),getActivity().getResources().getString(R.string.at6_desc), R.drawable.funicular, R.drawable.attractions, true));
        locations.add(new Location(getActivity().getResources().getString(R.string.at7_title),getActivity().getResources().getString(R.string.at7_desc), R.drawable.secu, R.drawable.attractions, true));

        LocationAdapter adapter = new LocationAdapter(getActivity(),0, locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
