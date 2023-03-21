package com.example.demo.arithmetic;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author renjing
 * @Description: ${todo}
 * @date 2019/3/19上午10:55
 */
public class PrintABC {
    Lock lock = new ReentrantLock();
    Condition c1 = lock.newCondition();
    Condition c2 = lock.newCondition();
    Condition c3 = lock.newCondition();
    int state = 1;

    public static void main(String[] args) {
        PrintABC test = new PrintABC();
        new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                test.printC();
            }
        },"C").start();

        new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                test.printA();
            }
        },"A").start();

        new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                test.printB();
            }
        },"B").start();
    }


    public void printA() {
        lock.lock();
        try {
            while (state != 1) {
                c1.await();
            }
            state = 2;
            c2.signalAll();
            System.out.println("A");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public void printB() {
        lock.lock();
        try {
            while (state != 2) {
                c2.await();
            }
            state = 3;
            c3.signalAll();
            System.out.println("B");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void printC() {
        lock.lock();
        try {
            while (state != 3) {
                c3.await();
            }
            state = 1;
            c1.signalAll();
            System.out.println("C");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
