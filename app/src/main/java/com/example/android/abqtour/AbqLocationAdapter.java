package com.example.android.abqtour;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AbqLocationAdapter extends RecyclerView.Adapter<AbqLocationAdapter.AbqLocationViewHolder> {

    // Inflate the view in this context
    private Context contextToInflate;

    // List of locations
    private List<AbqLocation> abqLocationList;

    // Constructor
    public AbqLocationAdapter(Context contextToInflate, List<AbqLocation> abqLocationList) {
        this.contextToInflate = contextToInflate;
        this.abqLocationList = abqLocationList;
    }

    @Override
    public AbqLocationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflate and return the view holder
        LayoutInflater inflater = LayoutInflater.from(contextToInflate);
        View view = inflater.inflate(R.layout.card_layout, null);
        return new AbqLocationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AbqLocationViewHolder holder, int position) {
        // Get the location at the current position
        AbqLocation abqLocation = abqLocationList.get(position);

        // Bind the data to the view holder views
        holder.imageView.setImageDrawable(contextToInflate.getResources().getDrawable(abqLocation.getImage()));
        holder.textViewName.setText(abqLocation.getName());
        holder.textViewDescription.setText(abqLocation.getDescription());
        holder.textViewAddress.setText(abqLocation.getAddress());
    }

    @Override
    public int getItemCount() {
        return abqLocationList.size();
    }

    class AbqLocationViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textViewName, textViewDescription, textViewAddress;

        public AbqLocationViewHolder(View cardView) {
            super(cardView);

            // Load the items from the card layout
            imageView = cardView.findViewById(R.id.card_image);
            textViewName = cardView.findViewById(R.id.card_name);
            textViewDescription = cardView.findViewById(R.id.card_description);
            textViewAddress = cardView.findViewById(R.id.card_address);
        }
    }
}
