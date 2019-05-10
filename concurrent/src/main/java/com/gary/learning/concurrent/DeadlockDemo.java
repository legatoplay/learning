package com.gary.learning.concurrent;

import java.util.concurrent.TimeUnit;

/**
 * Created by Gary on 2019-04-26.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2019-04-26
 * @since 0.0.1
 */
public class DeadlockDemo {


    static class TaskDeadLock implements Runnable {

        private final String lockA;
        private final String lockB;

        public TaskDeadLock(String lockA, String lockB) {
            this.lockA = lockA;
            this.lockB = lockB;
        }

        @Override
        public void run() {
            synchronized (this.lockA) {
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (this.lockB) {
                    System.out.println(Thread.currentThread().getName() + "\t" + "is finished");
                }
            }

        }
    }

    /**
     * Found one Java-level deadlock:
     * =============================
     * "B":
     * waiting to lock monitor 0x00000000031bd3c8 (object 0x00000000d708f950, a java.lang.String),
     * which is held by "A"
     * "A":
     * waiting to lock monitor 0x00000000031babe8 (object 0x00000000d708f980, a java.lang.String),
     * which is held by "B"
     * <p>
     * Java stack information for the threads listed above:
     * ===================================================
     * "B":
     * at com.gary.concurrent.DeadlockDemo$TaskDeadLock.run(DeadlockDemo.java:37)
     * - waiting to lock <0x00000000d708f950> (a java.lang.String)
     * - locked <0x00000000d708f980> (a java.lang.String)
     * at java.lang.Thread.run(Thread.java:748)
     * "A":
     * at com.gary.concurrent.DeadlockDemo$TaskDeadLock.run(DeadlockDemo.java:37)
     * - waiting to lock <0x00000000d708f980> (a java.lang.String)
     * - locked <0x00000000d708f950> (a java.lang.String)
     * at java.lang.Thread.run(Thread.java:748)
     * <p>
     * Found 1 deadlock.
     *
     * @param args
     */
    public static void main(String[] args) {
        String lockA = "A";
        String lockB = "B";
        new Thread(new TaskDeadLock(lockA, lockB), "A").start();
        new Thread(new TaskDeadLock(lockB, lockA), "B").start();
    }
}
