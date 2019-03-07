package com.ensias.pfa.pfa;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.ViewHolder>{

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View eventView = inflater.inflate(R.layout.event_row_layout, viewGroup, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(eventView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Event event = events.get(position);
        // Set item views based on your views and data model
        TextView date = viewHolder.tvDate;
        TextView location = viewHolder.tvLocation;
        TextView title = viewHolder.tvTitle;
        ImageView eventImage= viewHolder.eventImage;
        date.setText(event.getDate().getDate());
        location.setText(event.getLocation());
        title.setText(event.getTitle());
        eventImage.setImageURI(event.getImageUri());
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView tvTitle;
        public TextView tvLocation;
        public TextView tvDate;
        public ImageView eventImage;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvLocation = (TextView) itemView.findViewById(R.id.tvLocation);
            tvDate = (TextView) itemView.findViewById(R.id.tvDate);
            eventImage = (ImageView) itemView.findViewById(R.id.eventImage);
        }
    }
    private ArrayList<Event> events;

    // Pass in the contact array into the constructor
    public EventsAdapter(ArrayList<Event> events) {
        this.events = events;
    }
}
