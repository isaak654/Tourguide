package com.example.android.tourguide;

/**
 * {@link Location} represents any place in Messina. *
 */

public class Location {

    /**
     * Location variable
     */
    private String mLocation;

    /**
     * Address variable
     */
    private String mAddress;

    /**
     * Description variable
     */
    private String mDescription;

    /**
     * Image resource ID for the location
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for a location
     */
    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Create a new Location object.
     *
     * @param location        represents a place in Messina
     * @param address         is the address of a single location
     * @param imageResourceId is the drawable resource ID for the image associated with the location
     * @param description     is the description of the location
     */

    public Location(String location, String address, String description, int imageResourceId) {
        mLocation = location;
        mAddress = address;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the location.
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the address of the location.
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * Get the description of the location.
     */
    public String getDescription() {
        return mDescription;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this location.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
