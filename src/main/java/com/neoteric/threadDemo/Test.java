package com.neoteric.threadDemo;

public class Test {
    public static void main(String[] args) {
        System.out.println("main thread name - "+Thread.currentThread().getName());
        HelloWorldThred helloWorldThred = new HelloWorldThred();
        helloWorldThred.start();
        //thread is calling the hi()
    }
}
