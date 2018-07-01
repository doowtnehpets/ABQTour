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
        recyclerView = (RecyclerView) rootView.findViewById(R.id.locations_recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Set the background color to the secondaryLightColor
        recyclerView.setBackgroundColor(getResources().getColor(R.color.secondaryLightColor));

        // Initialize the list of locations
        abqLocationList = new ArrayList<>();

        // Add locations to the list
        abqLocationList.add(new AbqLocation(R.drawable.attraction_aquarium,
                "ABQ BioPark Aquarium",
                "Albuquerque's small, but pleasant aquarium. Exhibits designed to simulate the Rio Grande and the saltwater marshes of the Gulf of Mexico before moving on to ocean species.",
                "2601 Central Ave NW, Albuquerque, NM 87104"));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_botanical,
                "ABQ BioPark Botanic Garden",
                "Next door to the Aquarium, this expansive botanical garden is one of Albuquerque's real gems. The place is an oasis with a variety of gardens to explore, with an emphasis on high desert plants.",
                "2601 Central Ave NW, Albuquerque, NM 87104"));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_zoo,
                "ABQ BioPark Zoo",
                "It may not be as big as your average big city zoo, but this zoo is surprisingly comprehensive for its size, with most of the popular species you can expect to find at any good zoo.",
                "903 10th St SW, Albuquerque, NM 87102"));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_balloon,
                "Balloon Fiesta Park",
                "Location of the largest balloon festival, held every year. The Fiesta is the world's largest ballooning event and one of the most photographed events in the world.",
                "5000 Balloon Fiesta Pkwy NE, Albuquerque, NM 87113"));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_sandiacasino,
                "Sandia Casino & Resort",
                "Come gamble in Albuquerque's backyard. With over 2,300 unique slot machines, New Mexico’s only live Keno games, bingo, and 33 tables for poker, blackjack and more, see why Sandia is the place locals & visitors ",
                "30 Rainbow Rd, Albuquerque, NM 87113"));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_tram,
                "Sandia Peak Tram",
                "Runs from a lower terminus in the northeast heights to the top of 10,400-foot (3169 m) Sandia Peak east of the city, and is one of the longest and most spectacular aerial tramways in the world.",
                "30 Tramway Rd NE, Albuquerque, NM 87122"));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_tingley,
                "Tingley Beach",
                "A facility of the Albuquerque Biological Park, this park along the Rio Grande has fishing ponds for adults and children, a model boating pond, a cafe, and a gift shop where you can buy fishing licenses, fishing gear, or rent a pedal boat for a ride on the central pond.",
                "Paseo del Bosque Trail, Albuquerque, NM 87102"));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_unser,
                "Unser Racing Museum",
                "Operated by the local Unser racing family, this museum is dedicated to the racing legacy of the Unsers as well as to the sport of auto racing in general.",
                "1776 Montaño Rd NW, Albuquerque, NM 87107"));

        // Create the recycler view adapter
        AbqLocationAdapter adapter = new AbqLocationAdapter(getActivity(), abqLocationList);

        // Set adapter to recyclerview
        recyclerView.setAdapter(adapter);

        return rootView;
    }

}
