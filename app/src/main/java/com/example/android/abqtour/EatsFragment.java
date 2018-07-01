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
                "66 Diner",
                "50's and 60's retro diner with vintage jukebox and soda fountain on historic Route 66. Mouthwatering burgers, shakes & desserts.",
                "1405 Central Ave NE, Albuquerque, NM 87106"));

        abqLocationList.add(new AbqLocation(R.drawable.eat_bobs,
                "Bob's Burgers",
                "Taco burger, anyone? Spicy New Mexico chile served how you want. This local burger chain is always packed with locals for a reason.",
                "6628 Caminito Coors Drive NW, Albuquerque, NM 87120"));

        abqLocationList.add(new AbqLocation(R.drawable.eat_doghouse,
                "Dog House Drive In",
                "An Albuquerque classic. Old school take out serving burgers, chili cheese dogs, fries & shakes. Located on historic Route 66, very recognizable with its neon dog sign.",
                "1216 Central Ave NW, Albuquerque, NM 87102"));

        abqLocationList.add(new AbqLocation(R.drawable.eat_flyingstar,
                "Flying Star",
                "A local space age-themed chain with a wide variety of salads, sandwiches, entrees, New Mexican food, and superb desserts. Rated 'Best Bakery' in Albuquerque.",
                "10700 Corrales Road NW A, Albuquerque, NM 87114"));

        abqLocationList.add(new AbqLocation(R.drawable.eat_frontier,
                "Frontier Restaurant",
                "One of the most popular restaurants in Albuquerque; a big hangout for the college students at UNM. Good American and New Mexican food, the breakfast burrito here is one of the best in Albuquerque.",
                "2400 Central Ave SE, Albuquerque, NM 87106"));

        abqLocationList.add(new AbqLocation(R.drawable.eat_sadies,
                "Sadie's",
                "If you’re looking for a mouth-watering experience, then go to Sadie’s! They’ve been serving up hot, heavenly plates made with the distinctive flavors of true New Mexican cuisine for over 60 years.",
                "5400 Academy Rd NE, Albuquerque, NM 87109"));

        abqLocationList.add(new AbqLocation(R.drawable.eat_zinc,
                "Zinc Wine Bar & Bistro",
                "Fine dining in Albuquerque, using local ingredients. Located in Nob Hill. Zinc is pleasant and well-appointed inside. Don't miss the wine bar and jazz in the basement.",
                "3009 Central Ave NE, Albuquerque, NM 87106"));

        // Create the recycler view adapter
        AbqLocationAdapter adapter = new AbqLocationAdapter(getActivity(), abqLocationList);

        // Set adapter to recyclerview
        recyclerView.setAdapter(adapter);

        return rootView;
    }

}
