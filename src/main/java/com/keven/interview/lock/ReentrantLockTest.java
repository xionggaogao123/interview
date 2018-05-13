package com.keven.interview.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author keven
 * @date 2018-05-13 下午4:17
 * @Description
 */
public class ReentrantLockTest {


    //参数默认为false, 不公平锁
    public static ReentrantLock reentrantLock = new ReentrantLock();

    //公平锁，速度慢与不公平锁
    public static ReentrantLock lock = new ReentrantLock(false);


    /**
     * 使用场景1：
     * 比如一个定时任务，第一次定时任务还未完成，重复发起了第二次，直接返回false
     * 用户在界面交互时点击较长时间请求操作，防止多次点击导致后台重复执行
     */
    public static void lockTest1() {
        if (reentrantLock.tryLock()) {
            //如果已经被Lock了，则立即返回false,不会等待
            //达到忽略操作的效果，当执行1000线程时，有些未获得对象锁的线程，会自动跳过
            try {
                System.out.println("a" + Thread.currentThread().getName());
            } finally {
                {
                    reentrantLock.unlock();
                }
            }
        }
    }


    /**
     * 使用场景2：
     * 同步操作，类型synchronized , 如果被其它资源锁定，会在此等待锁释放，达到暂停的效果
     */
    public static void lockTest2() {
        try {
            //如果被其它资源锁定，会在此等待锁释放，达到暂停的效果
            reentrantLock.lock();
            System.out.println("aa" + Thread.currentThread().getName());
        } finally {
            reentrantLock.unlock();
        }
    }


    /**
     * 使用场景3：
     * 如果发现该操作正在执行，等待一段时间，如果规定时间未得到锁，放弃，防止资源处理不当，线程队列溢出，出现死锁
     */
    public static void lockTest3() {
        try {
            try {
                if (reentrantLock.tryLock(5, TimeUnit.SECONDS)) {
                    try {
                        System.out.println("aaa" + Thread.currentThread().getName());
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {

        }
    }


    /**
     * 使用场景4：
     * 中断正在进行的操作立刻释放锁，继续下一操作，比如 取消正在同步运行的操作，来防止不正常的长时间占用造成的阻塞
     */
    public static void lockTest4() {
        try {
            try {
                reentrantLock.lockInterruptibly();
                System.out.println("aaaa:" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }finally {
            reentrantLock.unlock();
        }
    }


    public static void main(String[] args) {
        for (int i = 0; i< 1000; i++){
            new Thread(() -> ReentrantLockTest.lockTest4()).start();
        }

    }
}
