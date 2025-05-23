package com.neoteric.threadDemo;

public class HelloWorldThred extends Thread{
    public void run(){
        hi();
    }
    public void hi(){
        setName("HelloWorldThread");
        System.out.println("thread name - "+Thread.currentThread().getName());
        System.out.println("hi");
    }

}
