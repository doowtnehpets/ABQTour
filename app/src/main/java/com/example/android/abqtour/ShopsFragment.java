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
public class ShopsFragment extends Fragment {

    // A list of all the locations
    List<AbqLocation> abqLocationList;

    // The Recycler View
    RecyclerView recyclerView;


    public ShopsFragment() {
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
        abqLocationList.add(new AbqLocation(R.drawable.shop_abquptown,
                getString(R.string.shops_abquptown_name),
                getString(R.string.shops_abquptown_desc),
                getString(R.string.shops_abquptown_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.shop_cottonwood,
                getString(R.string.shops_cottonwood_name),
                getString(R.string.shops_cottonwood_desc),
                getString(R.string.shops_cottonwood_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.shop_jackalope,
                getString(R.string.shops_jackalope_name),
                getString(R.string.shops_jackalope_desc),
                getString(R.string.shops_jackalope_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.shop_mamasminerals,
                getString(R.string.shops_mamas_name),
                getString(R.string.shops_mamas_desc),
                getString(R.string.shops_mamas_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.shop_masksymas,
                getString(R.string.shops_masks_name),
                getString(R.string.shops_masks_desc),
                getString(R.string.shops_masks_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.shop_emporium,
                getString(R.string.shops_emporium_name),
                getString(R.string.shops_emporium_desc),
                getString(R.string.shops_emporium_addr)));

        abqLocationList.add(new AbqLocation(R.drawable.shop_candylady,
                getString(R.string.shops_candy_name),
                getString(R.string.shops_candy_desc),
                getString(R.string.shops_candy_addr)));

        // Create the recycler view adapter
        AbqLocationAdapter adapter = new AbqLocationAdapter(getActivity(), abqLocationList);

        // Set adapter to recyclerview
        recyclerView.setAdapter(adapter);

        return rootView;
    }

}
