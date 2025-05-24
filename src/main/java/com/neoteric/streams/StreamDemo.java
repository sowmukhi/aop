package com.neoteric.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Neo","tech","sowmukhi");
        List<String> upperCaseName = names.stream()
                .filter(s -> s.startsWith("s"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseName);
        List<String> namesList = Arrays.asList("Neo","tech","SOWMUKHI");
        List<String> lowerCaseName = namesList.stream()
                .filter(s -> s.startsWith("S"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(lowerCaseName);

    }
}
