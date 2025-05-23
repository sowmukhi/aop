package com.neoteric.threadDemo;

public class MyTaskTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask("task1"));
        Thread t2 = new Thread(new MyTask("task2"));
        t1.start();
        t2.start();
    }
}
