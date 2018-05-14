package com.keven.interview.base;

/**
 * @author keven
 * @date 2018-05-14 下午1:54
 * @Description  二进制 、 位运算、位移运算
 *
 *
 *   >>  表示 算术右移，看箭头往右
 *   <<  表示 算术左移
 *   >>> 表示 逻辑右移
 *
 *   int 占 4个字节，一个字节8位，
 *   如 int a = 1; 表示如下
 *   0000 0000 0000 0000 0000 0000 0000 0001
 *
 *   int c = 8; 表示如下
 *   0000 0000 0000 0000 0000 0000 0000 1000
 *   c >> 2 表示如下
 *   0000 0000 0000 0000 0000 0000 0000 0010
 *
 *   得出结论：
 *   左移 多少位，值位 该数的2的多少次方* 位数。
 *   右移 相反。
 *
 *
 *   二进制的最高位是 符号位： 0 表示正数， 1 表示负数
 *   正数的 原码 、反码、 补码都一样
 *   负数的反码 = 它的原码 符号位 不变，其它位取反
 *   负数的补码 = 它的反码 + 1
 *   0 的反码，补码 都是0
 *   Java 没有无符号数，也就是说，java中的数 都是有 符号的
 *   在计算机运算的时候，都是以 补码 的方式 来运行的。
 *
 *
 *
 *
 *
 */
public class ErJinZhiTest {

    public static void main(String[] args){
        int a = 1 >> 4;
        int b = 2 << 4;
        int c = 8 >> 2;
        int d = 16 >> 3;
        // 结果为 0
        System.out.println(a);
        // 结果为 16
        System.out.println(b);
        // 结果为 2
        System.out.println(c);
        //结果为2
        System.out.println(d);



        // 取反 操作
        int aa = ~2;
        // 位与 操作
        int bb = 2 & 3;
        // 位或 操作
        int cc = 2 | 3;
        // 位异或 操作
        int dd = 4 ^ 5;

        //
        System.out.println(aa);

        System.out.println(bb);

        System.out.println(cc);

        System.out.println(dd);

    }
}
