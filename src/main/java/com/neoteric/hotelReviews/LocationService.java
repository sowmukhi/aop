package com.neoteric.hotelReviews;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocationService {

    static List<Location> locationList=new ArrayList<>();

    static {
        locationList.add(new Location(101,"Neoteric",1,1));
        locationList.add(new Location(101,"fabo",1,1));
        locationList.add(new Location(102,"itc",2,2));

    }

    public List<Location> getLocationByLatitudeLongitude(float latitude,float longitude) {
        List<Location> userLocations = new ArrayList<>();
        for(Location location:locationList){
            if(location.getLatitude() == latitude && location.getLongitude() == longitude){
                userLocations.add(location);
            }
        }return userLocations;
    }
}
