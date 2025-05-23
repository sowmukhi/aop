package com.neoteric.callableThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws Exception{
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Person> future = executor.submit(new  PersonDetailFetcherByName("Lakshmi"));

        Person person = future.get();
        if (person != null) {
            System.out.println("Person Found:");
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Gender: " + person.getGender());
        } else {
            System.out.println("No person found with name: " + person);
        }

        executor.shutdown();
    }
}
