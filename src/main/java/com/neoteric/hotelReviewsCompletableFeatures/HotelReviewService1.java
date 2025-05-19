package com.neoteric.hotelReviewsCompletableFeatures;


import java.util.ArrayList;
import java.util.List;

public class HotelReviewService1 {

    static List<Image1> hotelImageList = new ArrayList<>();
    static List<Review1> hotelReviewList = new ArrayList<>();

    static {
        hotelReviewList.add(new Review1(1,"good hotel",1000,101,"Neoteric"));
        hotelReviewList.add(new Review1(2,"very nice hotel",1010,101,"Neoteric"));
        hotelReviewList.add(new Review1(1, "good fab ", 1001, 101, "fabo"));
        hotelImageList.add(new Image1(888,"https://media-cdn.tripadvisor.com/media/photo-t/29/6e/2a/d1/caption.jpg",101,"Neoteric"));
    }

    public List<Image1> getHotelImageListByLocationAndName(int locationId, String name) {
        List<Image1> imageArrayList = new ArrayList<>();
        for (Image1 location : hotelImageList) {

            if (location.getLocationId() == locationId &&
                    location.getName().equalsIgnoreCase(name)) {
                imageArrayList.add(location);
            }
        }
        return imageArrayList;
    }
    public List<Review1> getHotelReviewListByLocationAndName(int locationId, String name) {
        List<Review1> reviewArrayList = new ArrayList<>();
        for (Review1 review : hotelReviewList) {
            if (review.getLocationId() == locationId && review.getName().equalsIgnoreCase(name)) {
                reviewArrayList.add(review);
                }
        }

        return reviewArrayList;
        }

}
