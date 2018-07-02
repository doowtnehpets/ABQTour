package com.example.android.abqtour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DrinksFragment extends Fragment {

    // A list of all the locations
    List<AbqLocation> abqLocationList;

    // The Recycler View
    RecyclerView recyclerView;


    public DrinksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the view with the locations_recycler
        View rootView = inflater.inflate(R.layout.locations_recycler, container, false);

        // Grab the locations_recyclerview from the layout and set fixed size and set the layout manager
        recyclerView = rootView.findViewById(R.id.locations_recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Set the background color to the secondaryLightColor
        recyclerView.setBackgroundColor(getResources().getColor(R.color.secondaryLightColor));

        // Initialize the list of locations
        abqLocationList = new ArrayList<>();

        // Add locations to the list
        abqLocationList.add(new AbqLocation(R.drawable.drink_burts,
                getString(R.string.drinks_burts_name),
                getString(R.string.drinks_burts_desc),
                getString(R.string.drinks_burts_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.drink_kellys,
                getString(R.string.drinks_kellys_name),
                getString(R.string.drinks_kellys_desc),
                getString(R.string.drinks_kellys_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.drink_lacumbre,
                getString(R.string.drinks_lacumbre_name),
                getString(R.string.drinks_lacumbre_desc),
                getString(R.string.drinks_lacumbre_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.drink_marble,
                getString(R.string.drinks_marble_name),
                getString(R.string.drinks_marble_desc),
                getString(R.string.drinks_marble_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.drink_montevista,
                getString(R.string.drinks_montevista_name),
                getString(R.string.drinks_montevista_desc),
                getString(R.string.drinks_montevista_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.drink_launchpad,
                getString(R.string.drinks_launchpad_name),
                getString(R.string.drinks_launchpad_desc),
                getString(R.string.drinks_launchpad_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.drink_library,
                getString(R.string.drinks_library_name),
                getString(R.string.drinks_library_desc),
                getString(R.string.drinks_library_addr)));

        // Create the recycler view adapter
        AbqLocationAdapter adapter = new AbqLocationAdapter(getActivity(), abqLocationList);

        // Set adapter to recyclerview
        recyclerView.setAdapter(adapter);

        return rootView;
    }

}
