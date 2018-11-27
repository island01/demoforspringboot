package com.semaphore;

import java.util.concurrent.Semaphore;

public class demo {
    public static  void  main(String args[]){
        Semaphore semaphore = new Semaphore(10);

        try {

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println( semaphore.getQueueLength());
    }
}
