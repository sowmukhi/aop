package com.neoteric.threadDemo;

public class MainRunnable {
    public static void main(String[] args) {
        System.out.println("main thread name - "+Thread.currentThread().getName());
        Thread t =new Thread(new HelloWorldRunnable());
        t.start();
    }
}
