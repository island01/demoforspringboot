package com.mmall.demo;


import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

@Slf4j
public class CountExample {

    private static int threadTotal = 200;

    private  static  int clientTotal = 5000;

    private static long count = 0;

    public static void main(String[] args){
        //创建线程池  newCachedThreadPool-- 缓存
        ExecutorService exec = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(threadTotal);
        for(int index = 0; index < clientTotal; index++){
            exec.execute(() ->{
                try {
                    semaphore.acquire();
                    add();
                    semaphore.release();
                } catch (InterruptedException e) {
                    log.error("exception",e);
                }
            });
        }
        exec.shutdown();
        log.info("count:{}",count);
    }

    private static  void add(){
        count ++;
    }
}
