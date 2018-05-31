package com.keven.interview.test;

/**
 * @author keven
 * @date 2018-05-31 下午4:16
 * @Description
 */
public class TestConstructor {

    public TestConstructor() {


    }


    private void TestConstructor() {
        System.out.println("构造器必须要和class 同名，但方法也是可以和class 同名的");
    }


    public Integer testtryCatch() {

        try {

            int i = 1/1;
            System.out.println("logic..");
            return 1;

        }catch (Exception e) {
            System.out.println("catch exception ..");
            return 2;

        }finally {
            System.out.println("finally ..");
            return 3;
        }

    }


    public static void changeValue(String str) {
        str = str + '5';
    }


    public static Boolean foo(char c) {
        System.out.println(c);
        return true;
    }

    public static void main(String[] args) {
       /* TestConstructor testConstructor = new TestConstructor();
        Integer result = testConstructor.testtryCatch();
        System.out.println(result);

        String  str = "1234";
        changeValue(str);

        System.out.println(str);*/

       int i = 0;
       for (foo('a'); foo('b') && (i< 2); foo('c' )){
           i ++;
           foo('d');
        }

    }
}
