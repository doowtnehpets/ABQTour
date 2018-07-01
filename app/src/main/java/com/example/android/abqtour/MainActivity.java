package com.example.android.abqtour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // A list of all the locations
    List<AbqLocation> abqLocationList;

    // The Recycler View
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the recycler_view and store in recyclerView
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize the list of locations
        abqLocationList = new ArrayList<>();

        // Add locations to the list
        abqLocationList.add(new AbqLocation(R.drawable.attraction_aquarium,
                "ABQ BioPark Aquarium",
                "Albuquerque's small, but pleasant aquarium.",
                "2601 Central Ave NW, Albuquerque, NM 87104"));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_aquarium,
                "ABQ BioPark Botanic Garden",
                "Albuquerque's garden oasis in the desert.",
                "2601 Central Ave NW, Albuquerque, NM 87104"));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_aquarium,
                "ABQ BioPark Zoo",
                "2.5 miles of paths and more than 250 species of animals.",
                "903 10th St SW, Albuquerque, NM 87102"));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_aquarium,
                "Balloon Fiesta Park",
                "Location of the largest balloon, held every year.",
                "Balloon Fiesta Pkwy NE, Albuquerque, NM 87113"));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_aquarium,
                "Sandia Casino & Resort",
                "Come gamble in Albuquerque's backyard.",
                "30 Rainbow Rd, Albuquerque, NM 87113"));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_aquarium,
                "Sandia Peak Tram",
                "Albuquerque's aerial tramway to the top of the Sandia mountains.",
                "30 Tramway Rd NE, Albuquerque, NM 87122"));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_aquarium,
                "Tingley Beach",
                "Fishing ponds, model boating pond and more.",
                "Paseo del Bosque Trail, Albuquerque, NM 87102"));

        abqLocationList.add(new AbqLocation(R.drawable.attraction_aquarium,
                "Unser Racing Museum",
                "Non-profit museum celebrating the accomplishments of the Unsers.",
                "1776 Montaño Rd NW, Albuquerque, NM 87107"));

        // Create the recycler view adapter
        AbqLocationAdapter adapter = new AbqLocationAdapter(this, abqLocationList);

        // Set adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }
}
