package com.neoteric.hotelReviews;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelReviewService {

    static List<Image> hotelImageList = new ArrayList<>();
    static List<Review> hotelReviewList = new ArrayList<>();

    static {
        hotelReviewList.add(new Review(1,"good hotel",1000,101,"Neoteric"));
        hotelReviewList.add(new Review(2,"very nice hotel",1010,101,"Neoteric"));
        hotelReviewList.add(new Review(1, "good fab ", 1001, 101, "fabo"));
        hotelImageList.add(new Image(888,"https://media-cdn.tripadvisor.com/media/photo-t/29/6e/2a/d1/caption.jpg",101,"Neoteric"));
    }

    public List<Image> getHotelImageListByLocationAndName(int locationId,String name) {
        List<Image> imageArrayList = new ArrayList<>();
        for (Image location : hotelImageList) {

            if (location.getLocationId() == locationId &&
                    location.getName() == name) {
                imageArrayList.add(location);
            }
        }
        return imageArrayList;
    }
    public List<Review> getHotelReviewListByLocationAndName(int locationId, String name) {
        List<Review> reviewArrayList = new ArrayList<>();
        for (Review review : hotelReviewList) {
            if (review.getLocationId() == locationId && review.getName() == name) {
                reviewArrayList.add(review);
                }
        }

        return reviewArrayList;
        }

}
