package com.keven.interview.base;

/**
 * @author keven
 * @date 2018-05-13 下午10:02
 * @Description break 的作用是 跳出整个循环条件，循环体下面的逻辑
 */
public class BreakTest {

    public void testBreak() {
        int count = 0;
        for (int i =0; i< 10; i++){
            count ++;
            if (i == 2){
                break;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args){
        BreakTest test = new BreakTest();
        test.testBreak();
    }

}
