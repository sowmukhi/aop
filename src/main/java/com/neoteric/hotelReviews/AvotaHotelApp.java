package com.neoteric.hotelReviews;

import java.util.List;

public class AvotaHotelApp {
    public static void main(String[] args) {
        HotelService hotelService = new HotelService();
        Hotel hotel = hotelService.getHotelByName("Neoteric");
        LocationService locationService = new LocationService();
        List<Location> locationList = locationService.getLocationByLatitudeLongitude(hotel.getLatitude(), hotel.getLongitude());
        Location hotelLocation = null;
        for (Location location : locationList) {
            if (location.getName().equalsIgnoreCase(hotel.getHotelName())) {
                hotelLocation = location;
            }
        }
        HotelReviewService hotelReviewService = new HotelReviewService();
        List<Review> hotelReviewList = hotelReviewService.getHotelReviewListByLocationAndName(hotelLocation.getLocationId(), hotelLocation.getName());
        List<Image> hotelImageList = hotelReviewService.getHotelImageListByLocationAndName(hotelLocation.getLocationId(), hotelLocation.getName());
        System.out.println(hotelReviewList);
        System.out.println(hotelImageList);
    }
}
