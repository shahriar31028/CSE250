package com.example.sight.Fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.sight.JavaClasses.DataViewHolder;
import com.example.sight.JavaClasses.Post;
import com.example.sight.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * A simple {@link Fragment} subclass.
 */
public class FeedFragment extends Fragment {

    private View view;
    private RecyclerView recyclerView;
    private DatabaseReference ref;


    public FeedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_feed, container, false);
        recyclerView = view.findViewById(R.id.feedRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        ref = FirebaseDatabase.getInstance().getReference().child("posts").child("all");

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

        FirebaseRecyclerOptions options = new FirebaseRecyclerOptions.Builder<Post>()
                .setQuery(ref, Post.class).build();

        FirebaseRecyclerAdapter<Post, DataViewHolder> adapter =
                new FirebaseRecyclerAdapter<Post, DataViewHolder>(options) {
                    @Override
                    protected void onBindViewHolder(@NonNull DataViewHolder dataViewHolder, int i, @NonNull final Post post) {
                        final Post temp = post;
                        dataViewHolder.titleview.setText(post.getTitle());
                        dataViewHolder.postview.setText(post.getPost());
                        dataViewHolder.nameview.setText(post.getName());
                        dataViewHolder.saveButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                FirebaseDatabase.getInstance().getReference().child("posts").child("saved")
                                        .child(FirebaseAuth.getInstance().getUid()).push()
                                .setValue(temp)
                                .addOnSuccessListener(new OnSuccessListener<Void>() {
                                    @Override
                                    public void onSuccess(Void aVoid) {
                                        Toast.makeText(getContext(), "Post saved", Toast.LENGTH_LONG).show();
                                    }
                                });
                            }
                        });
                    }

                    @NonNull
                    @Override
                    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder, parent, false);

                        return new DataViewHolder(view);
                    }
                };
        recyclerView.setAdapter(adapter);
        adapter.startListening();
    }
}
