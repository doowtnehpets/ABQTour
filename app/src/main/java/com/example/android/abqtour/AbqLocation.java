package com.example.android.abqtour;

/**
 * Custom class used to store locations for each view
 * <p>
 * image stores the view id of the image
 * name stores the name of the location
 * description stores a description of the location
 * address is used to store the address of the location
 */
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
