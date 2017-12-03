package com.lvzhi.thread;

/**
 * Created by lvzhi on 2017/12/3
 * 测试Thread的join方法
 */
public class JoinTest implements  Runnable{

    private static int a = 0;
    @Override
    public void run() {
        for (int k = 0; k < 5; k++) {
            a = a + 1;
        }
    }

    public static void main(String[] args) {
        Runnable r = new JoinTest();
        Thread thread = new Thread(r);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a);
    }
}
