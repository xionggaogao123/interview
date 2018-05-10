package com.keven.interview.thread;

/**
 * @author keven
 * @date 2018-05-10 上午8:01
 * @Description 创建线程的第一种方式
 */
public class MyThread1 extends Thread{

    @Override
    public void run() {
        System.out.println("start run thread ...");
    }


    public static void main(String[] args){
        MyThread1 thread1 = new MyThread1();
        thread1.run();
    }

}
