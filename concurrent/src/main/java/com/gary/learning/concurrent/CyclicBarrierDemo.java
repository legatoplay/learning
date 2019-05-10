package com.gary.learning.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by Gary on 2019-04-18.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2019-04-18
 * @since 0.0.1
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        int threadSize = 100;
        CyclicBarrier barrier = new CyclicBarrier(threadSize,
                () -> System.out.println(Thread.currentThread().getName() + " 所有任务执行完成")
        );
        for (int i = 0; i < threadSize; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName());
                    barrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }, "Thread-" + i).start();
        }

    }
}
