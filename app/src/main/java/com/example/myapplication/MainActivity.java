package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    // Adapter setup and startup function
    public void initViews(){
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new DataAdapter(prepareData()));

    }

    // Fill the list with classes of images
    private ArrayList<Image> prepareData(){
        ArrayList<Image> android_version = new ArrayList<Image>();
        for(int i = 0; i<Constants.image_names.length; i++){
            android_version.add(
                    new Image(
                            Constants.image_names[i],
                            Constants.image_urls[i],
                            Constants.image_facts[i]
                    )
            );
        }
        return android_version;

    }

}