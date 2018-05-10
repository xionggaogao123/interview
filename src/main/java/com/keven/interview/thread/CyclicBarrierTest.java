package com.keven.interview.thread;


import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierTest {

    private CyclicBarrier cyclicBarrier = new CyclicBarrier(4);

    private Random random = new Random();

    class  TaskDemo implements Runnable{

        private String id;

        TaskDemo(String id){
            this.id = id;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(random.nextInt(1000));
                System.out.println("thread  " + id + "  will wait");
                cyclicBarrier.await();
                System.out.println("thread  " + id + " is over");
            }catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args){
        CyclicBarrierTest cyclicBarrierTest = new CyclicBarrierTest();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(cyclicBarrierTest.new TaskDemo("a"));
        executorService.submit(cyclicBarrierTest.new TaskDemo("b"));
        executorService.submit(cyclicBarrierTest.new TaskDemo("c"));
        executorService.submit(cyclicBarrierTest.new TaskDemo("d"));
        executorService.shutdown();
    }
}
