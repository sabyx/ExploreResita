package com.example.sabyx.exploreresita;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sabyx.exploreresita.activity.LocationDetailsActivity;

import java.util.List;

public class LocationAdapter extends ArrayAdapter<Location> {

    public static final String DATA_KEY = "data";
    private Context parentActivity;

    public LocationAdapter(@NonNull Context context, int resource, @NonNull List<Location> objects) {
        super(context, resource, objects);
        this.parentActivity = context;
    }

    @Override
    public View getView(int position, @Nullable View listItemView, @NonNull final ViewGroup parent) {
        ViewHolder viewHolder;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = listItemView.findViewById(R.id.image);
            viewHolder.titleView = listItemView.findViewById(R.id.item_title);
            viewHolder.button = listItemView.findViewById(R.id.item_details);
            listItemView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) listItemView.getTag();
        }

        final Location currentLocation = getItem(position);

        if (currentLocation.isShowIcon()) {
            viewHolder.imageView.setImageResource(currentLocation.getIconResourceID());
            viewHolder.imageView.setVisibility(View.VISIBLE);
        } else {
            viewHolder.imageView.setVisibility(View.GONE);
        }

        viewHolder.titleView.setText(currentLocation.getTitle());

        viewHolder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parentActivity, LocationDetailsActivity.class);
                intent.putExtra(DATA_KEY, currentLocation);
                parentActivity.startActivity(intent);
            }
        });

        return listItemView;
    }

    static class ViewHolder {
        private ImageView imageView;
        private TextView titleView;
        private Button button;
    }
}

