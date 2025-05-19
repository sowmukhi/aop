package com.neoteric.hotelReviewsCompletableFeatures;

import java.util.HashMap;
import java.util.Map;

public class HotelService1 {

    static Map<String, Hotel1> hotelMap=new HashMap<>();

    static {
        hotelMap.put("Neoteric",new Hotel1(1,1,"Neoteric"));
        hotelMap.put("fabo",new Hotel1(1,1,"fabo"));
        hotelMap.put("itc",new Hotel1(2,2,"itc"));
    }

    public Hotel1 getHotelByName(String name){
        return hotelMap.get(name);
    }

}
