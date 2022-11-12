package com.example.sight.JavaClasses;



import android.widget.Filter;
import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;


public class CustomFilter extends Filter {

    RecyclerViewAdapter adapter;
    ArrayList<Book>filterList;


    public CustomFilter(ArrayList<Book>filterList, RecyclerViewAdapter adapter) {
        this.adapter = adapter;
        this.filterList = filterList;

    }

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults results = new FilterResults();
        if(constraint!=null && constraint.length()>0){
            constraint=constraint.toString().toUpperCase();
            /*ArrayList<Book_Activity>filteredModels = new ArrayList<>();*/
            ArrayList<Book>filteredModels = new ArrayList<>();
            for(int i=0; i<filterList.size(); i++){

                //If you want to filter any item


                String Str = new String();
                String Str2 = new String();
                String Str3 = new String();
                Str = filterList.get(i).getTitle().toString().toUpperCase(); //To sort title
                Str2 = filterList.get(i).getCategory().toString().toUpperCase(); //To sort batch
                Str3= filterList.get(i).getCompany().toString().toUpperCase();  //To sort company

                if(Str.contains(constraint)){
                    filteredModels.add(filterList.get(i));
                }
                if(Str2.contains(constraint)){
                    filteredModels.add(filterList.get(i));
                }

                if(Str3.contains(constraint)){
                    filteredModels.add(filterList.get(i));
                }

                //If you want to filter any item

            }
            results.count = filteredModels.size();
            results.values = filteredModels;
        }
        else {
            results.count = filterList.size();
            results.values = filterList;
        }
        return results;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {
        adapter.models = (ArrayList<Book>) results.values;
        adapter.notifyDataSetChanged();

    }


}


