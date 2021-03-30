package com.example.demo.thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 用AtomicInteger或者加锁
 * @author aa
 *
 */
public class ThreadTest {

	// private static int count = 200;
	static AtomicInteger count = new AtomicInteger(200);

	public static void main(String[] args) throws InterruptedException {

//		Lock lock = new ReentrantLock();

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				todoThread();
			}
		}, "A窗口");
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				todoThread();
			}
		}, "B窗口");
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				todoThread();
			}
		}, "C窗口");
		t.start();
		t1.start();
		t2.start();

	}

	public static void todoThread() {
		while (count.get() > 0) {
			// lock.lock();
			try {
				System.out.println(Thread.currentThread().getName() + "售出第" + count.getAndDecrement() + "张票");
			} finally {
				// lock.unlock();
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
