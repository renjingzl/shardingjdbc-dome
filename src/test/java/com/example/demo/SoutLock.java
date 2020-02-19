package com.example.demo;

/**
 * @author renjing
 * @Description:
 * @date 2020/2/19下午5:01
 */
public class SoutLock {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println("位置0");
        new Thread1().start();
        while (n2 == 0) {
//            synchronized (o){}
//            System.out.println("1111");
        }
        System.out.println("位置1");
    }

    private static  int n2 = 0;//或者加volatile保证内存可见性
    static class Thread1 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            n2 = 1;
        }
    }
}