package com.example.sight.JavaClasses;

import android.content.Context;
import android.content.Intent;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sight.Book_Activity;
import com.example.sight.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> implements Filterable {
    // public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    ArrayList<Book> mData;
    ArrayList<Book>models,filterList;
    CustomFilter filter;


    public RecyclerViewAdapter(Context mContext, ArrayList<Book>models) {
        this.mContext = mContext;
        this.models = models;
        mData = models;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_book,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder,final int position) {

        holder.tv_book_title.setText(models.get(position).getTitle());
        holder.img_book_thumbnail.setImageResource(models.get(position).getThumbnail());
        Animation animation = AnimationUtils.loadAnimation(mContext,android.R.anim.slide_in_left);
        holder.itemView.startAnimation(animation);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, Book_Activity.class);

                // passing data to the book activity
                intent.putExtra("Title", models.get(position).getTitle());
                intent.putExtra("Description", models.get(position).getDescription());
                intent.putExtra("Category",models.get(position).getCategory());
                intent.putExtra("Company", models.get(position).getCompany());
                intent.putExtra("Thumbnail", models.get(position).getThumbnail());
                // start the activity
                mContext.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    @Override
    public Filter getFilter() {
        if(filter==null){
            filter = new CustomFilter(mData,this);
        }
        return filter;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_book_title;
        ImageView img_book_thumbnail;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_book_title = (TextView) itemView.findViewById(R.id.book_title_id);
            img_book_thumbnail = (ImageView) itemView.findViewById(R.id.book_img_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);


        }
    }

}