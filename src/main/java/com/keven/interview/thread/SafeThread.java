package com.keven.interview.thread;


/**
 * 线程安全 问题
 */
public class SafeThread implements Runnable{


    private static int shareNum  ;

    @Override
    public  synchronized void run() {
        shareNum = 4;
        System.out.println("[" + Thread.currentThread().getName() + "] 获得shareNum 的值："  + shareNum);
        shareNum = 10;
        System.out.println("[" + Thread.currentThread().getName() + "] 获得shareNum 的值：" + shareNum * 2);
    }

    public static void main(String[]args){
        SafeThread safeThread = new SafeThread();
        for (int i = 0; i< 10000; i++){
            new Thread(safeThread, "线程" + i).start();
        }
    }

}
