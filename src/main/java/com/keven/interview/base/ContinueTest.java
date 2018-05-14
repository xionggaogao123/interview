package com.keven.interview.base;

/**
 * @author keven
 * @date 2018-05-13 下午10:06
 * @Description Continue 的作用是跳出本次循环，
 */
public class ContinueTest {

    public void testContinue() {
        int count = 0;
        for (int i = 0; i< 10; i++){
            if (i == 2){
                continue;
            }
            count ++;
        }

        System.out.println(count);
    }

    public static void main(String[] args){
        ContinueTest test = new ContinueTest();
        test.testContinue();
    }
}
