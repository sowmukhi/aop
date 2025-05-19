package com.neoteric.hotelReviewsCompletableFeatures;

import java.util.List;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AvotaHotelApp1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        HotelService1 hotelService = new HotelService1();
        LocationService1 locationService = new LocationService1();
        HotelReviewService1 hotelReviewService = new HotelReviewService1();

        CompletableFuture<Void> appFuture = CompletableFuture.supplyAsync(() -> hotelService.getHotelByName("Neoteric"))
                .thenCompose(hotel -> CompletableFuture.supplyAsync(() ->
                                locationService.getLocationByLatitudeLongitude(hotel.getLatitude(), hotel.getLongitude()))
                        .thenApply(locationList -> {
                            for (Location1 location : locationList) {
                                if (location.getName().equalsIgnoreCase(hotel.getHotelName())) {
                                    return location;
                                }
                            }
                            return null;
                        })
                        .thenCompose(hotelLocation -> {
                            if (hotelLocation == null) {
                                return CompletableFuture.failedFuture(new RuntimeException("Hotel location not found"));
                            }
                            CompletableFuture<List<Review1>> reviewsFuture =
                                    CompletableFuture.supplyAsync(() ->
                                            hotelReviewService.getHotelReviewListByLocationAndName(
                                                    hotelLocation.getLocationId(), hotelLocation.getName()));

                            CompletableFuture<List<Image1>> imagesFuture =
                                    CompletableFuture.supplyAsync(() ->
                                            hotelReviewService.getHotelImageListByLocationAndName(
                                                    hotelLocation.getLocationId(), hotelLocation.getName()));

                            return reviewsFuture.thenCombine(imagesFuture, (reviews, images) -> {
                                System.out.println("Reviews:");
                                reviews.forEach(System.out::println);

                                System.out.println("Images:");
                                images.forEach(System.out::println);
                                return null;
                            }).thenAccept(result -> {});
                        })
                ).exceptionally(ex -> {
                    System.err.println("Error: " + ex.getMessage());
                    return null;
                });

        appFuture.get(); // Wait for all futures to complete
    }
}
