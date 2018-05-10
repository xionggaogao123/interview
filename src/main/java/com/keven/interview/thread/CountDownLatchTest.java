package com.keven.interview.thread;


import java.util.concurrent.CountDownLatch;

/**
 * countDownLatch 的 用法
 *
 * countDownLatch 中的构造函数接受一个int 类型的参数作为 计数器，也可以理解为N 个线程。
 * 当我们调用一次 countDownLatch 中的countDown 方法时，N 就会减1
 * CountDownLatch 的await 会阻塞当前线程，直到N 变成零。
 *
 *
 * 	CountDownLatch 是一个同步工具类，它允许一个或多个线程一直等待，直到其他线程的操作执行完成后再执行。
 * 	例如：应用程序的主线程 希望 在负责启动框架服务的线程 已经启动所有的框架服务之后 再执行。
 它是通过一个计算器 来实现的，计数器的初始值 为线程的数量，每当一个线程完成了自己的任务后，计数器的值就会减1，
 当计数器值达到0时，它表示所有的线程都已经完成了任务，然后在闭锁上 等待的线程 就可以恢复执行任务了。

 *
 *
 *
 *
 *
 */
public class CountDownLatchTest {

    private static CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) throws Exception{
        new Thread(() -> {
            System.out.println(1);
            countDownLatch.countDown();
            System.out.println(2);
            countDownLatch.countDown();
        }).start();

        countDownLatch.await();
        System.out.println(3);
    }
}
