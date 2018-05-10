package com.keven.interview.thread;


/**
 * sleep() , wait() , yield(), join() 用户与区别
 *
 *
 * sleep() 当当前线程进行到阻塞状态
 * wait()
 */
public class SleepWaitYieldJoinThread implements Runnable{


    private String name;

    @Override
    public void run() {
        for (int i=0; i< 10; i++) {
            Thread.yield();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + "" + i);
        }


    }


    public static void main(String[] args){
        SleepWaitYieldJoinThread sleepWaitYieldJoinThread1 = new SleepWaitYieldJoinThread();
        SleepWaitYieldJoinThread sleepWaitYieldJoinThread2 = new SleepWaitYieldJoinThread();
        sleepWaitYieldJoinThread1.name = "one-->";
        sleepWaitYieldJoinThread2.name = "two-->";

        Thread t1 = new Thread(sleepWaitYieldJoinThread1);
        Thread t2 = new Thread(sleepWaitYieldJoinThread2);
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

    }


}
