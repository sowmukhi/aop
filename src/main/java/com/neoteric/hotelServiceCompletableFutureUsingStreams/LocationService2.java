package com.neoteric.hotelServiceCompletableFutureUsingStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LocationService2 {
    static List<Location2> locationList = new ArrayList<>();

    static {
        locationList.add(new Location2(101, "Neoteric", 1, 1));
        locationList.add(new Location2(101, "fabo", 1, 1));
        locationList.add(new Location2(102, "itc", 2, 2));
    }

    public List<Location2> getLocationByLatitudeLongitude(float latitude, float longitude) {
        return locationList.stream()
                .filter(loc -> loc.getLatitude() == latitude && loc.getLongitude() == longitude)
                .collect(Collectors.toList());
    }
}
