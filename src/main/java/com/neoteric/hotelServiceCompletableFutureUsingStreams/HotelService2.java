package com.neoteric.hotelServiceCompletableFutureUsingStreams;

import java.util.HashMap;
import java.util.Map;

public class HotelService2 {
    static Map<String, Hotel2> hotelMap = new HashMap<>();
    static {
        hotelMap.put("Neoteric", new Hotel2(1, 1, "Neoteric"));
        hotelMap.put("fabo", new Hotel2(1, 1, "fabo"));
        hotelMap.put("itc", new Hotel2(2, 2, "itc"));
    }

    public Hotel2 getHotelByName(String name) {
        return hotelMap.get(name);
    }
}
