package com.keven.interview.thread;

/**
 * @author keven
 * @date 2018-05-10 上午8:03
 * @Description
 */
public class MyThread2 implements Runnable{


    @Override
    public void run() {
        System.out.println("start run thread2 ...");
    }


    public static void main(String[] args){
        MyThread2 thread2 = new MyThread2();
        Thread thread = new Thread(thread2);
        thread.start();
    }
}
