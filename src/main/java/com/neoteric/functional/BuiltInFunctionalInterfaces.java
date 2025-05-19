package com.neoteric.functional;

import java.util.function.*;

public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        // Consumer
        Consumer<String> printer = s -> System.out.println("Hello, " + s);
        printer.accept("Bob");

        // Supplier
        Supplier<Double> randomValue = Math::random;
        System.out.println("Random: " + randomValue.get());

        // Predicate
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));

        // Function
        Function<String, Integer> lengthFinder = String::length;
        System.out.println("Length of 'Java': " + lengthFinder.apply("Java"));

        // BiFunction
        BiFunction<Integer,Integer,Integer> add = (a,b) -> a+b;
        System.out.println("addition "+add.apply(1,2));
    }
}