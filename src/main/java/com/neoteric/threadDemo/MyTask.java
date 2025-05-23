package com.neoteric.threadDemo;

public class MyTask implements Runnable{
    private String name;

    public MyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name+" is running by "+Thread.currentThread().getName());
    }

}
