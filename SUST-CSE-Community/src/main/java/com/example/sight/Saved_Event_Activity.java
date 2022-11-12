package com.example.sight;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.sight.JavaClasses.SavedEvents;
import com.example.sight.JavaClasses.SavedPosts;
import com.example.sight.JavaClasses.SavedViewHolder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Saved_Event_Activity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<SavedEvents> arrayList;
    private FirebaseRecyclerOptions<SavedEvents> options;
    private FirebaseRecyclerAdapter<SavedEvents, SavedViewHolder> adapter;
    private DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved__event_);

        recyclerView = findViewById(R.id.savedRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrayList = new ArrayList<>();

        ref = FirebaseDatabase.getInstance().getReference().child("events").child("saved")
                .child(FirebaseAuth.getInstance().getUid());
        ref.keepSynced(true);

        options = new FirebaseRecyclerOptions.Builder<SavedEvents>().setQuery(ref, SavedEvents.class).build();

        adapter = new FirebaseRecyclerAdapter<SavedEvents, SavedViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull SavedViewHolder holder, int i, @NonNull SavedEvents savedEvents) {
                holder.nameView.setText(savedEvents.getName());
                holder.postView.setText(savedEvents.getTitle());
            }

            @NonNull
            @Override
            public SavedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return new SavedViewHolder(LayoutInflater.from(Saved_Event_Activity.this).inflate(R.layout.saved_view_holder, parent, false));
            }
        };

        recyclerView.setAdapter(adapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}
