package com.example.android.cprpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ContentActivity extends AppCompatActivity {

    ArrayList<InfoClass> arrcontent = new ArrayList<>();  //instantiating a list of infoclass type
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        arrcontent.add(new InfoClass("1. Shout and Tap\n" +
                "Shout and gently tap the child on the shoulder. " +
                "If there is no response and not breathing or not breathing normally, " +
                "position the infant on his or her back and begin CPR.", R.drawable.infant));

        rv = (RecyclerView)findViewById(R.id.content_rv);

    }
}
