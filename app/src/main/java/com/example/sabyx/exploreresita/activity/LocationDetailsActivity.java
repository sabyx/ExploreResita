package com.example.sabyx.exploreresita.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sabyx.exploreresita.R;
import com.example.sabyx.exploreresita.Location;
import com.example.sabyx.exploreresita.LocationAdapter;

public class LocationDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        Location location =  (Location) getIntent().getExtras().get(LocationAdapter.DATA_KEY);

        TextView title = findViewById(R.id.location_title);
        TextView description = findViewById(R.id.location_desc);
        ImageView image = findViewById(R.id.location_image);

        title.setText(location.getTitle());
        description.setText(location.getDescription());
        image.setImageResource(location.getImageResourceID());
    }
}
