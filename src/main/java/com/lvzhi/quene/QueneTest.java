package com.lvzhi.quene;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executors;

/**
 * Created by lvzhi on 2017/12/10
 */
public class QueneTest {

    @org.junit.Test
    public void LinkedListQueneTest() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("poll="+queue.poll()); //返回第一个元素，并在队列中删除
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("element="+queue.element()); //返回第一个元素
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("peek="+queue.peek()); //返回第一个元素
        for(String q : queue){
            System.out.println(q);
        }
    }

    @Test
    public void testSynchronousQueue() {
        Executors.newCachedThreadPool();
    }

}
