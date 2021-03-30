package com.example.demo.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author renjing
 * @Description: 线程池处理list不重复，每4个使用一个线程
 * @date 2020/4/14下午4:22
 */
public class ThreadPoolBatchForList {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println("初始化：" + list.size());
        int size = list.size();
        int batch = size % 4 == 0 ? size / 4 : size / 4 + 1;
        for (int j = 0; j < batch; j++) {
            int end = (j + 1) * 4;
            if (end > size) {
                end = size;
            }
            List<Integer> subList = list.subList(j * 4, end);
            threadPool.execute(() -> {
                for (Integer i : subList) {
                    try {
                        System.out.println(Thread.currentThread().getName() + "=====>" + i);
                        Thread.sleep(5000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}