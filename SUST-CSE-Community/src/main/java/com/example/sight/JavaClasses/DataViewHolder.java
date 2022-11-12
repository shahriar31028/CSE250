package com.example.sight.JavaClasses;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sight.R;

public class DataViewHolder extends RecyclerView.ViewHolder {

    public TextView titleview, postview, nameview;
    public Button saveButton;

    public DataViewHolder(@NonNull View itemView) {
        super(itemView);

        titleview = itemView.findViewById(R.id.titleView);
        postview = itemView.findViewById(R.id.postView);
        nameview = itemView.findViewById(R.id.nameView);
        saveButton = itemView.findViewById(R.id.savePostButton);
    }
}
