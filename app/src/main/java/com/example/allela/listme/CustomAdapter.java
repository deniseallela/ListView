package com.example.allela.listme;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

class CustomAdapter extends ArrayAdapter<Custom>{
    Context context;
    int resource;
    List<Custom> listitems;
//generate a constructor to initialize values
    public CustomAdapter(@NonNull Context context,
                         int resource, List<Custom> listitems) {
        super(context, resource,listitems);
        this.context = context;
        this.resource = resource;
        this.listitems = listitems;
    }

    @NonNull
    @Override
    public View getView(final int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.dee,null);
        //find the items from the inflated layout based on their id
        TextView item=view.findViewById(R.id.textView);
        TextView price=view.findViewById(R.id.textView2);
        ImageView pic=view.findViewById(R.id.imageView);
        Custom custom=listitems.get(position);
        item.setText(custom.getItem());
        price.setText(custom.getPrice());
        pic.setImageDrawable(context.getResources().
                getDrawable(custom.getImages()));
        view.findViewById(R.id.button).setOnClickListener
                (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makepay(position);
            }
        });
        return view;
    }

    private void makepay(int position) {
        AlertDialog.Builder builder=new AlertDialog.Builder(context);
        builder.setTitle("Purchase Item ");
        builder.setPositiveButton("Confirm Payment", new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent simToolKitLaunchIntent = getContext().getPackageManager().getLaunchIntentForPackage("com.android.stk");
                        if(simToolKitLaunchIntent != null) {
                            context.startActivity(simToolKitLaunchIntent);
                        }
                    }
                });
        builder.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(context, "Order cancelled", Toast.LENGTH_SHORT).show();
                    }
                });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();

    }


}
