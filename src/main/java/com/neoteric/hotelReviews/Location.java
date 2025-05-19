package com.neoteric.hotelReviews;

public class Location {
    private int locationId;
    private String name;
    private float latitude;
    private float longitude;

    public Location(int locationId, String name, float latitude, float longitude) {
        this.locationId = locationId;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }


    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
