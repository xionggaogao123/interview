package com.keven.interview.thread;

/**
 * @author keven
 * @date 2018-05-10 下午9:31
 * @Description synchronized 有三种 用法
 *
 * （1）修饰普通的方法，锁的是 当前对象
 * （2）修饰静态方法 ，锁的是类 对象
 * （3）修饰代码块， 锁的是 代码中的对象
 */
public class SynchronizedTest {

    public void method1() {
        System.out.println("method1 start ...");
        try {
            System.out.println("method1 excute ...");
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("method1 end ...");
    }

    public void method2() {
        System.out.println("method2 start ...");
        try {
            System.out.println("method2 excute ...");
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("method2 end ...");
    }

    public synchronized void method3() {
        System.out.println("method3 start ...");
        try {
            System.out.println("method3 excute ...");
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("method3 end ...");
    }

    public synchronized void method4() {
        System.out.println("method4 start ...");
        try {
            System.out.println("method4 excute ...");
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("method4 end ...");
    }




    public static void main(String[] args){
        SynchronizedTest test = new SynchronizedTest();
        new Thread(() -> test.method1()).start();
        new Thread(() -> test.method2()).start();

        new Thread(() -> test.method3()).start();
        new Thread(() -> test.method4()).start();
    }

}
