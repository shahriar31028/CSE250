package com.example.sight;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Book_Activity extends AppCompatActivity {

    private TextView tvtitle,tvdescription,tvcategory,tvCompany;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_);

        tvtitle = (TextView) findViewById(R.id.txttitle);
        tvdescription = (TextView) findViewById(R.id.txtDesc);
        tvcategory = (TextView) findViewById(R.id.txtCat);
        tvCompany = (TextView) findViewById(R.id.txtCompanyid);

        img = (ImageView) findViewById(R.id.bookthumbnail);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Category  = intent.getExtras().getString("Category");
        String Description = intent.getExtras().getString("Description");
        String Company= intent.getExtras().getString("Company");
        int image = intent.getExtras().getInt("Thumbnail") ;

        tvtitle.setText(Title);
        tvcategory.setText(Category);
        tvdescription.setText(Description);
        tvCompany.setText(Company);
        img.setImageResource(image);

        //for test
        //If you want different phone numbers for different person, then create a button and the rest should be same like category or title

        Button btn = (Button) findViewById(R.id.Callid);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01768092693"));
                startActivity(intent);
            }
        });

        //for test
    }
}