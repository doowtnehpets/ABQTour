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
                "Burt's Tiki Lounge",
                "Island-themed bar with cocktails & live music. Eclectic doesn't even begin to describe Burt's. Monday nights, Geeks Who Drink pub trivia.",
                "515 Central Ave NW, Albuquerque, NM 87102"));

        abqLocationList.add(new AbqLocation(R.drawable.drink_kellys,
                "Kelly's Brew Pub",
                "A Route 66-era gas station and garage-turned-restaurant, with lots of vintage decorations. Wide variety of beers brewed on site. Good food and an extensive outdoor patio for people watching.",
                "3222 Central Ave SE, Albuquerque, NM 87106"));

        abqLocationList.add(new AbqLocation(R.drawable.drink_lacumbre,
                "La Cumbre Brewing Co",
                "A new microbrewery opened by a former brewer from Chama River Brewing Co with food trucks, live music & more.",
                "3313 Girard Blvd NE, Albuquerque, NM 87107"));

        abqLocationList.add(new AbqLocation(R.drawable.drink_marble,
                "Marble Brewery",
                "Fine local micro brewery in Albuquerque's industrial heart. Limited food selection, but in a taproom -- that's the point.",
                "111 Marble Ave NW, Albuquerque, NM 87102"));

        abqLocationList.add(new AbqLocation(R.drawable.drink_montevista,
                "Monte Vista Fire Station",
                "Southwestern pub featuring live local musicians. Located in a historic former fire station in the Nob Hill neighborhood",
                "3201 Central Ave NE, Albuquerque, NM 87106"));

        abqLocationList.add(new AbqLocation(R.drawable.drink_launchpad,
                "The Launchpad",
                "Well established music venue and rock bar and perhaps the best place to see live music in town. Located in downtown Albuquerque.",
                "618 Central Ave SW, Albuquerque, NM 87102"));

        abqLocationList.add(new AbqLocation(R.drawable.drink_library,
                "The Library Bar & Grill",
                "Drinks, burgers, burritos & drinks. School girl dress bartenders serve bikers by day and club goers by night.",
                "312 Central Ave SW, Albuquerque, NM 87102"));

        // Create the recycler view adapter
        AbqLocationAdapter adapter = new AbqLocationAdapter(getActivity(), abqLocationList);

        // Set adapter to recyclerview
        recyclerView.setAdapter(adapter);

        return rootView;
    }

}
