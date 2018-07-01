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
                "ABQ Uptown",
                "An outdoor mall with more high-end retail stores, such as Apple Computer, Talbots, Pottery Barn, and Williams-Sonoma.",
                "2200 Louisiana Blvd NE, Albuquerque, NM 87110"));

        abqLocationList.add(new AbqLocation(R.drawable.shop_cottonwood,
                "Cottonwood Mall",
                "Shopping mall in the Northwest Albuquerque area. A typical indoor mall, the surrounding area contains most typical 'big box' retailers.",
                "10000 Coors Bypass NW, Albuquerque, NM 87114"));

        abqLocationList.add(new AbqLocation(R.drawable.shop_jackalope,
                "Jackalope Nursery",
                "A local chain of stores (there is also a location in Santa Fe) that sells folk art, pottery, rugs, and furniture from around the world. Folk art, pottery, handmade furniture & rugs.",
                "6400 San Mateo Blvd NE, Albuquerque, NM 87109"));

        abqLocationList.add(new AbqLocation(R.drawable.shop_mamasminerals,
                "Mama's Minerals",
                "A wonderful store with an extensive collection of minerals, geologic specimens, gems, beads, supplies for the geologist, information about local geology, and more.",
                "800 20th St NW B, Albuquerque, NM 87104"));

        abqLocationList.add(new AbqLocation(R.drawable.shop_masksymas,
                "Masks y Mas",
                "An art gallery and store cram packed with Day of the Dead folk art. Commemorate El Día de los Muertos with dead figurines, art, t-shirts and more.",
                "3106 Central Ave SE, Albuquerque, NM 87106"));

        abqLocationList.add(new AbqLocation(R.drawable.shop_emporium,
                "Old Town Emporium",
                "A very large gift shop with all the typical tourist kitsch, which certainly has its charm. New Mexico gifts, souvenirs & collectibles.",
                "204 San Felipe St NW, Albuquerque, NM 87104"));

        abqLocationList.add(new AbqLocation(R.drawable.shop_candylady,
                "The Candy Lady",
                "The Candy Lady is a New Mexico Tradition for over 30 years. A popular candy shop with lots of homemade fudge, chocolates, caramels, and other sweets.",
                "424 San Felipe St NW, Albuquerque, NM 87104"));

        // Create the recycler view adapter
        AbqLocationAdapter adapter = new AbqLocationAdapter(getActivity(), abqLocationList);

        // Set adapter to recyclerview
        recyclerView.setAdapter(adapter);

        return rootView;
    }

}
