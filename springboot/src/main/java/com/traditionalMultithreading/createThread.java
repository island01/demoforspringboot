package com.traditionalMultithreading;

import org.junit.jupiter.api.Test;


public class createThread {

    @Test
    public void trhreadTest(){
        Thread meThread = new Thread(){
            @Override
            public void run(){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        meThread.start();
    }

    @Test
    public void runableTest(){
        Thread personThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        personThread.start();
    }

    @Test
    public void TraditionalThreadTest(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("当前线程 runable" );
            }


        }){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("当前线程 thread" );
            }
        }.start();
    }
}
