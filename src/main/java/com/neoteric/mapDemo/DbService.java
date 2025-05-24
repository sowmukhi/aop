package com.neoteric.mapDemo;

import java.util.HashMap;
import java.util.Map;

public class DbService {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Apple",1);
        map.put("Banana",2);
        map.put("Grapes",3);
        map.put("berry",4);

        System.out.println("Updated Map: " + map);


        // Accessing a value
        System.out.println("Apple count: " + map.get("Apple"));

        // Checking for a key
        if (map.containsKey("Banana")) {
            System.out.println("Banana exists in map.");
        }

        // Removing a key
        map.remove("Grapes");

        System.out.println("Updated Map: " + map);
//keySet()
        for (String key : map.keySet()){
           int value = map.get(key);
            System.out.println(key + "->" + value);
        }
//values()
        for(int value : map.values()){
            System.out.println(value);
        }
//entrySet()
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + "->" + value);
        }
//forEach
        map.forEach((key,value)-> System.out.println(key+"->"+value));
//streams
        map.entrySet().stream()
                .forEach(entry-> System.out.println(entry.getKey()+"->"+entry.getValue()));


    }

}
