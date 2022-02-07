package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   // List of weather types
    private final String image_names[] = {
            "Clouds",
            "Sun",
            "Partial clouds",
            "Snow",
            "Sleet",
            "Mist",
            "Clear",
            "Rain",
            "Rain thunder",
            "Fog"
    };

    // List with image urls
    private final String image_urls[] = {
            "https://www.dovora.com/resources/weather-icons/showcase/modern_showcase/angry_clouds.png",
            "https://www.dovora.com/resources/weather-icons/showcase/modern_showcase/day_clear.png",
            "https://www.dovora.com/resources/weather-icons/showcase/modern_showcase/night_half_moon_partial_cloud.png",
            "https://www.dovora.com/resources/weather-icons/showcase/modern_showcase/night_half_moon_snow.png",
            "https://www.dovora.com/resources/weather-icons/showcase/modern_showcase/sleet.png",
            "https://www.dovora.com/resources/weather-icons/showcase/modern_showcase/mist.png",
            "https://www.dovora.com/resources/weather-icons/showcase/modern_showcase/night_full_moon_clear.png",
            "https://www.dovora.com/resources/weather-icons/showcase/modern_showcase/night_half_moon_rain.png",
            "https://www.dovora.com/resources/weather-icons/showcase/modern_showcase/rain_thunder.png",
            "https://www.dovora.com/resources/weather-icons/showcase/modern_showcase/fog.png"
    };

    // List with phrases about the weather
    private final String image_facts[] = {
            "Облака такие красивые",
            "Солнце очень горячее",
            "Ночные облака",
            "Снег",
            "Снег и дождь",
            "облачно",
            "Чисто",
            "Дождь",
            "Гроза",
            "Облачно"
    };

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
        for(int i = 0; i<image_names.length; i++){
            android_version.add(new Image(image_names[i], image_urls[i], image_facts[i]));
        }
        return android_version;

    }

    // Image row class
    static class Image{
        private final String name;
        private final String url;
        private final String fact;

        public Image(String name, String url, String fact) {
            this.name = name;
            this.url = url;
            this.fact = fact;
        }

        public String getName() {
            return this.name;
        }

        public String getUrl() {
            return this.url;
        }

        public String getFact() {
            return this.fact;
        }
    }
}