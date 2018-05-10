package com.keven.interview.thread;


/**
 * 知识点： join 用于让当前执行线程 等待 join 线程 执行结束，
 * 其实现原理 是不停检查join线程是否存活，如果join线程存活，则让当前线程永远wait.
 * 直到join 线程中止后，线程的this.notifyAll会被调用。
 *
 *
 *
 */
public class JoinThread {

    public static void main(String[] args) throws Exception{
        Thread thread1 = new Thread(() -> {
            System.out.println("thread1 start ...");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("thread2 start ...");
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("all thread start finished");
    }
}
