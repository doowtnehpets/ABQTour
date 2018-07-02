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
public class AttractionsFragment extends Fragment {

    // A list of all the locations
    List<AbqLocation> abqLocationList;

    // The Recycler View
    RecyclerView recyclerView;


    public AttractionsFragment() {
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
        abqLocationList.add(new AbqLocation(R.drawable.attraction_aquarium,
                getString(R.string.attract_abqaqua_name),
                getString(R.string.attract_abqaqua_desc),
                getString(R.string.attract_abqaqua_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_botanical,
                getString(R.string.attract_abqbio_name),
                getString(R.string.attract_abqbio_desc),
                getString(R.string.attract_abqbio_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_zoo,
                getString(R.string.attract_abqzoo_name),
                getString(R.string.attract_abqzoo_desc),
                getString(R.string.attract_abqzoo_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_balloon,
                getString(R.string.attract_balloon_name),
                getString(R.string.attract_balloon_desc),
                getString(R.string.attract_balloon_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_sandiacasino,
                getString(R.string.attract_sandia_name),
                getString(R.string.attract_sandia_desc),
                getString(R.string.attract_sandia_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_tram,
                getString(R.string.attract_tram_name),
                getString(R.string.attract_tram_desc),
                getString(R.string.attract_tram_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_tingley,
                getString(R.string.attract_tingley_name),
                getString(R.string.attract_tingley_desc),
                getString(R.string.attract_tingley_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_unser,
                getString(R.string.attract_unser_name),
                getString(R.string.attract_unser_desc),
                getString(R.string.attract_unser_addr)));

        // Create the recycler view adapter
        AbqLocationAdapter adapter = new AbqLocationAdapter(getActivity(), abqLocationList);

        // Set adapter to recyclerview
        recyclerView.setAdapter(adapter);

        return rootView;
    }

}
