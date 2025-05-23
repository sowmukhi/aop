package com.neoteric.threadDemo;

import static org.apache.tomcat.util.net.openssl.OpenSSLStatus.setName;

public class HelloWorldRunnable implements Runnable{
    @Override
    public void run() {
        hi();
    }
    public void hi(){
        System.out.println("main thread name - "+Thread.currentThread().getName());
        System.out.println("hi");
    }
}
