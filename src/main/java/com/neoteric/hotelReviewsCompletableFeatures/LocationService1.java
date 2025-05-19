package com.neoteric.hotelReviewsCompletableFeatures;


import java.util.ArrayList;
import java.util.List;

public class LocationService1 {

    static List<Location1> locationList=new ArrayList<>();

    static {
        locationList.add(new Location1(101,"Neoteric",1,1));
        locationList.add(new Location1(101,"fabo",1,1));
        locationList.add(new Location1(102,"itc",2,2));

    }

    public List<Location1> getLocationByLatitudeLongitude(float latitude, float longitude) {
        List<Location1> userLocations = new ArrayList<>();
        for(Location1 location:locationList){
            if(location.getLatitude() == latitude && location.getLongitude() == longitude){
                userLocations.add(location);
            }
        }return userLocations;
    }
}
