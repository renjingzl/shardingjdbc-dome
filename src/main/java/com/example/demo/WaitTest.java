package com.example.demo;

import static java.lang.Thread.sleep;

/**
 * @Auther: YUANEL
 * @Date: 2018/12/6 15:45
 * @Description:
 *   wait（）与notify（）都是obj的方法
 */
public class WaitTest {
    public static void main(String[] args) {

        ThreadA t1 = new ThreadA("t1");
        synchronized(t1) {
            try {
                // 启动“线程t1”
                System.out.println(Thread.currentThread().getName()+" start t1");
                t1.start();
                // 主线程等待t1通过notify()唤醒。
                System.out.println(Thread.currentThread().getName()+" wait()");
                sleep(5000);
                t1.wait();
                System.out.println(Thread.currentThread().getName()+" continue");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class ThreadA extends Thread{

    public ThreadA(String name) {
        super(name);
    }
    @Override
    public void run() {
       // System.out.println("执行到这里！！！！");
        synchronized (this) {
            System.out.println(Thread.currentThread().getName()+" call notify()");
            // 唤醒当前的wait线程
            notify();
        }
    }
}