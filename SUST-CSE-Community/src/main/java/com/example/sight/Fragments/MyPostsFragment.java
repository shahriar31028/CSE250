package com.example.sight.Fragments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.sight.LoginActivity;
import com.example.sight.MainActivity2;
import com.example.sight.R;
import com.example.sight.SignupActivity;
import com.example.sight.WebActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyPostsFragment extends Fragment {

    //Button findAlumniBtn, websiteBtn;

    public MyPostsFragment() {
        // Required empty public constructor
    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Button findAlumniBtn = (Button) getView().findViewById(R.id.findAlumniId);
        Button websiteBtn = (Button) getView().findViewById(R.id.websiteID);


        websiteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(), "Successfully logged in", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getActivity(), WebActivity.class);
                startActivity(intent);

            }
        });





        findAlumniBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(), "Successfully logged in", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getActivity(), MainActivity2.class);
                startActivity(intent);

            }
        });

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {





        return inflater.inflate(R.layout.fragment_my_posts, container, false);
    }


}

