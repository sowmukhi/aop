package com.neoteric.hotelReviews;

import java.util.HashMap;
import java.util.Map;

public class HotelService {

    static Map<String,Hotel> hotelMap=new HashMap<>();

    static {
        hotelMap.put("Neoteric",new Hotel(1,1,"Neoteric"));
        hotelMap.put("fabo",new Hotel(1,1,"fabo"));
        hotelMap.put("itc",new Hotel(2,2,"itc"));
    }

    public Hotel getHotelByName(String name){
        return hotelMap.get(name);
    }

}
