package com.gary.learning.concurrent.statics;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Gary on 2019-04-18.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2019-04-18
 * @since 0.0.1
 */
public class StaticMethodThreadSafeCheck {
    private static final int THREAD_SIZE = 2000;
    //非线程安全，必须加锁
    private static int countIntValue = 0;
    //非线程安全，必须加锁
    private static Integer countInteger = 0;
    private static AtomicInteger countAtomicInteger = new AtomicInteger(0);

    public static void addNoLock() {
        countIntValue++;
        countInteger++;
        countAtomicInteger.incrementAndGet();
    }

    public static void addWithLock(){
        synchronized (StaticMethodThreadSafeCheck.class) {
            countIntValue++;
            countInteger++;
            countAtomicInteger.incrementAndGet();
        }
    }

    public static void print() {
        System.out.println("int value--" + countIntValue);
        System.out.println("Integer value--" + countInteger);
        System.out.println("AtomicInteger value--" + countAtomicInteger.get());
    }


    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(THREAD_SIZE);
        for (int i = 0; i < THREAD_SIZE; i++) {
            new Thread(() -> {
                StaticMethodThreadSafeCheck.addNoLock();
//                StaticMethodThreadSafeCheck.addWithLock();
                countDownLatch.countDown();
            }).start();
        }
        try {
            countDownLatch.await();
            StaticMethodThreadSafeCheck.print();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
