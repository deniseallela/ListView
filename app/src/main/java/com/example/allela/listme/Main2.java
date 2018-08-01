package com.example.allela.listme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2 extends AppCompatActivity {
//DECLARE VARIABLES TO HOLD VIEW
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        next=findViewById(R.id.button2);
        //set on click listener for button
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent ti open last page
                Intent dee=new Intent(getApplicationContext(),
                        listings.class);
                startActivity(dee);
            }
        });
    }
}
