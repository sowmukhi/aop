package com.neoteric.hotelServiceCompletableFutureUsingStreams;

import java.util.List;

public class AvotaHotelApp2 {
    public static void main(String[] args) {
        HotelService2 hotelService = new HotelService2();
        LocationService2 locationService = new LocationService2();
        HotelReviewService2 reviewService = new HotelReviewService2();

        Hotel2 hotel = hotelService.getHotelByName("Neoteric");

        List<Location2> matchedLocations = locationService.getLocationByLatitudeLongitude(hotel.getLatitude(), hotel.getLongitude());

        matchedLocations.stream()
                .filter(loc -> loc.getName().equalsIgnoreCase(hotel.getHotelName()))
                .findFirst()
                .ifPresentOrElse(location -> {
                    List<Review2> reviews = reviewService.getHotelReviewListByLocationAndName(location.getLocationId(), location.getName());
                    List<Images2> images = reviewService.getHotelImageListByLocationAndName(location.getLocationId(), location.getName());

                    System.out.println("Reviews:");
                    reviews.forEach(System.out::println);

                    System.out.println("Images:");
                    images.forEach(System.out::println);
                }, () -> {
                    System.err.println("Hotel location not found");
                });
    }
}