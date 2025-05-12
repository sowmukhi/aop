package com.neoteric.aop;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public void doWork() {
        System.out.println("Doing actual work in MyService.");
    }
}
