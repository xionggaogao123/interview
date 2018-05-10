package com.keven.interview.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author keven
 * @date 2018-05-10 上午8:14
 * @Description
 */
public class MyThread3 implements Callable{

    @Override
    public Object call() throws Exception {
        return 1;
    }


    public static void main(String[] args){
        MyThread3 thread3 = new MyThread3();

    }
}
