package com.lvzhi.quene;

import org.junit.Test;

import java.util.concurrent.SynchronousQueue;

/**
 * Created by lvzhi on 2017/12/10
 */
public class SynchronousQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        final SynchronousQueue<Integer> queue = new SynchronousQueue<Integer>();

        Thread putThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("put thread start");
                try {
                    queue.add(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("put thread end");
            }
        });

        Thread takeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("take thread start");
                try {
                    System.out.println("take from putThread: " + queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("take thread end");
            }
        });

        takeThread.start();
        Thread.sleep(1000);
        putThread.start();
    }

    @Test
    public void test(){
        System.out.println(returnTest());
    }

    public int returnTest() {
        int a = 2;
        try {
            return a;
        } finally {
            a = 1;
            return a;
        }

    }
}
