package com.neoteric.hotelServiceCompletableFutureUsingStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HotelReviewService2 {
    static List<Images2> hotelImageList = new ArrayList<>();
    static List<Review2> hotelReviewList = new ArrayList<>();

    static {
        hotelReviewList.add(new Review2(1,"good hotel",1000,101,"Neoteric"));
        hotelReviewList.add(new Review2(2,"very nice hotel",1010,101,"Neoteric"));
        hotelReviewList.add(new Review2(1, "good fab ", 1001, 101, "fabo"));
        hotelImageList.add(new Images2(888,"https://media-cdn.tripadvisor.com/media/photo-t/29/6e/2a/d1/caption.jpg",101,"Neoteric"));
    }

    public List<Images2> getHotelImageListByLocationAndName(int locationId, String name) {
        return hotelImageList.stream()
                .filter(img -> img.getLocationId() == locationId && img.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public List<Review2> getHotelReviewListByLocationAndName(int locationId, String name) {
        return hotelReviewList.stream()
                .filter(review -> review.getLocationId() == locationId && review.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }
}
