package com.example.sabyx.exploreresita;

import java.io.Serializable;

public class Location implements Serializable {
    private String title;
    private String description;
    private int imageResourceID;
    private int iconResourceID;
    private boolean showIcon;

    public Location(String title, String description, int imageResourceID, int iconResourceID, boolean showIcon) {
        this.title = title;
        this.description = description;
        this.imageResourceID = imageResourceID;
        this.iconResourceID = iconResourceID;
        this.showIcon = showIcon;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public int getIconResourceID(){
        return iconResourceID;
    }

    public boolean isShowIcon() {
        return showIcon;
    }
}
