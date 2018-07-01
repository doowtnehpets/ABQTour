package com.example.android.abqtour;

public class AbqLocation {

    private int image;
    private String name;
    private String description;
    private String address;

    public AbqLocation(int image, String name, String description, String address) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.address = address;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }
}
