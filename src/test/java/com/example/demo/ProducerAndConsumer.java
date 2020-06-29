package com.example.demo;


/**
 * @author renjing
 * @Description:
 * @date 2020/5/26上午10:13
 */
public class ProducerAndConsumer {
    public static void main(String[] args) {

        Shop shop = new Shop();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    shop.addCount();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    shop.subCount();
                }
            }
        }).start();
    }

}

class Shop{
    private int count = 0;

    public Shop() {
    }

    public synchronized void addCount() {
        while (count != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        System.out.println("生产商品:" + count);
        notify();
    }

    public synchronized void subCount() {
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        System.out.println("消费商品:" + count);
        notify();
    }
}