package com.keven.interview.base;


/**
 *    % 取余 运算 ： 比如 100 ➗ 3 ， 商为 33， 余数为1
 *
 *      1 % 10 结果为1
 *      2 % 10 结果为2
 *      3 % 10 结果为3
 *
 *      11 % 10 结果为1
 *
 *      很明显，当一个小的数 对一个 大的数 取余，结果为它本身，
 *              一个大的数，对一个比它小的数 取余，结果 要把大的数/小的数，余的数就是结果
 *
 *
 *      从 下面的结果 中 可以看出， 一个数a 对 一个 b 取余。结果在 b 的范围内。
 *
 */
public class TestYu {

    public static void main(String[] args){

        int a = 1 % 10;  // 1
        int b =  5 % 10; // 5
        int c = 6 % 10; // 6

        int d = 18 % 10;  // 8
        int f = 110 % 10; // 0

        int e = 888 % 10;  //8

        int m = 567 % 10; // 7

        int n = 1 / 1024;


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(e);
        System.out.println(m);
        System.out.println(n);

    }
}
