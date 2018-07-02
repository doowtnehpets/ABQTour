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
public class EatsFragment extends Fragment {

    // A list of all the locations
    List<AbqLocation> abqLocationList;

    // The Recycler View
    RecyclerView recyclerView;


    public EatsFragment() {
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
        abqLocationList.add(new AbqLocation(R.drawable.eat_66diner,
                getString(R.string.eats_66diner_name),
                getString(R.string.eats_66diner_desc),
                getString(R.string.eats_66diner_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.eat_bobs,
                getString(R.string.eats_bobs_name),
                getString(R.string.eats_bobs_desc),
                getString(R.string.eats_bobs_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.eat_doghouse,
                getString(R.string.eats_doghouse_name),
                getString(R.string.eats_doghouse_desc),
                getString(R.string.eats_doghouse_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.eat_flyingstar,
                getString(R.string.eats_flying_name),
                getString(R.string.eats_flying_desc),
                getString(R.string.eats_flying_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.eat_frontier,
                getString(R.string.eats_frontier_name),
                getString(R.string.eats_frontier_desc),
                getString(R.string.eats_frontier_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.eat_sadies,
                getString(R.string.eats_sadies_name),
                getString(R.string.eats_sadies_desc),
                getString(R.string.eats_sadies_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.eat_zinc,
                getString(R.string.eats_zinc_name),
                getString(R.string.eats_zinc_desc),
                getString(R.string.eats_zinc_addr)));

        // Create the recycler view adapter
        AbqLocationAdapter adapter = new AbqLocationAdapter(getActivity(), abqLocationList);

        // Set adapter to recyclerview
        recyclerView.setAdapter(adapter);

        return rootView;
    }

}
