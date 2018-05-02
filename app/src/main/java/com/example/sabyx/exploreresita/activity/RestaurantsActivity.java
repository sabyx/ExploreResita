package com.example.sabyx.exploreresita.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.sabyx.exploreresita.R;
import com.example.sabyx.exploreresita.fragment.RestaurantsFragment;

public class RestaurantsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new RestaurantsFragment()).commit();
    }
}
