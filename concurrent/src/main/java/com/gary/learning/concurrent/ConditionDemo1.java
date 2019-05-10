package com.gary.learning.concurrent;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Gary on 2019-04-28.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2019-04-28
 * @since 0.0.1
 */
public class ConditionDemo1 {

    private static Lock lock = new ReentrantLock();
    private static Condition conCondition = lock.newCondition();
    private static volatile int number = 0;
    private static AtomicInteger total = new AtomicInteger(0);
    private static int maxValue = 100;

    static class Producer implements Runnable {
        @Override
        public void run() {
            try {
                lock.lock();
                while (total.get() == maxValue) {
                    return;
                }
                number++;
                total.incrementAndGet();
                System.out.println("生产：" + number);
                conCondition.signalAll();
            } finally {
                lock.unlock();
            }
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            try {
                lock.lock();
                while (number == 0) {
                    conCondition.await();
                }
                number--;
                System.out.println("消费：" + number);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }


    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        for (int i = 0; i < 100; i++) {
            new Thread(producer).start();
            new Thread(producer).start();
            new Thread(producer).start();
            new Thread(consumer).start();
        }
    }

}
