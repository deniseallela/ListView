package com.example.allela.listme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class listings extends AppCompatActivity {
        //declare variables to hold view
    List<Custom> listitems;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listings);
        //find items based on their ids
        listView=findViewById(R.id.listview);
        listitems=new ArrayList<>();
        //add items to array list
        listitems.add(new Custom(R.drawable.a,"Kales","120/kg"));
        listitems.add(new Custom(R.drawable.b,"Onions","420/kg"));
        listitems.add(new Custom(R.drawable.c,"Tomatoes","20/kg"));
        listitems.add(new Custom(R.drawable.d,"Mangoes","190/kg"));
        listitems.add(new Custom(R.drawable.e,"Oranges","170/kg"));
        listitems.add(new Custom(R.drawable.f,"Carrots","120/kg"));
        listitems.add(new Custom(R.drawable.g,"Spinach","120/kg"));
        listitems.add(new Custom(R.drawable.h,"Nuts","100/kg"));
        listitems.add(new Custom(R.drawable.a,"Kales","143/kg"));
        CustomAdapter adapter=new CustomAdapter(this,R.layout.dee,listitems);
        listView.setAdapter(adapter);










    }
}
