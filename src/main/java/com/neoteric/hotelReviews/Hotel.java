package com.neoteric.hotelReviews;

public class Hotel {
    private float latitude;
    private float longitude;
    private String hotelName;

    public Hotel(float latitude, float longitude, String hotelName) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.hotelName = hotelName;
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

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}
