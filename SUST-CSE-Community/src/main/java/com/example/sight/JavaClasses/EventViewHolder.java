package com.example.sight.JavaClasses;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sight.R;

public class EventViewHolder extends RecyclerView.ViewHolder {

    public TextView titleView, timeView;
    public Button saveButton;

    public EventViewHolder(@NonNull View itemView) {
        super(itemView);

        titleView = itemView.findViewById(R.id.event_name);
        timeView = itemView.findViewById(R.id.event_time);
        saveButton = itemView.findViewById(R.id.save_the_event);
    }
}
