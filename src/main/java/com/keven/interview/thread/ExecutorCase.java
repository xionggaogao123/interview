package com.keven.interview.thread;


import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * 线程池的使用
 */
public class ExecutorCase {

    // 初始化 一个 包含 10 个线程 的线程池 executor
    private static Executor executor = Executors.newFixedThreadPool(10);

    public static void main(String[] args){
        // 通过 executor.execute 方法 提交 20 个任务， 每个任务 打印当前的线程名
        // 负责执行任务的线程 的生命周期 都由 Executor 框架进行管理
        for (int i = 0; i< 20; i++){
            executor.execute(new Task());
        }
    }


    static class Task implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
