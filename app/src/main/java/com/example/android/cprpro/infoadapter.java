package com.example.android.cprpro;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;

import java.util.ArrayList;

/**
 * Created by Raina on 27-04-2017.
 */



public class infoadapter extends RecyclerView.Adapter<infoadapter.infoviewholder>{

    ArrayList<InfoClass> infoc;

    public infoadapter(ArrayList<InfoClass> ic){
        this.infoc = ic;
    }

    @Override
    public infoviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutid = R.layout.list;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean boo =false;


        return null;
    }

    @Override
    public void onBindViewHolder(infoviewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return infoc.size();
    }






    public class infoviewholder extends RecyclerView.ViewHolder{
        ImageView imgv;
        TextView tv;

        public infoviewholder(View itemview){
            super(itemview);

            imgv = (ImageView) itemview.findViewById(R.id.imageView);
            tv = (TextView) itemview.findViewById(R.id.textView);
        }
    }
}
