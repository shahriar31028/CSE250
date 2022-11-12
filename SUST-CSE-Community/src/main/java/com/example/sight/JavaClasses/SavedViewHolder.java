package com.example.sight.JavaClasses;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sight.R;

public class SavedViewHolder extends RecyclerView.ViewHolder {

    public TextView nameView, postView;
    public SavedViewHolder(@NonNull View itemView) {
        super(itemView);

        nameView = itemView.findViewById(R.id.nameView);
        postView = itemView.findViewById(R.id.postView);
    }
}
