package com.keven.interview.guava;


import com.google.common.base.Optional;

/**
 * @author keven
 * @date 2018-05-28 下午1:54
 * @Description  Optional 类
 *
 *
 *  Optional 用来处理 非空多像的不可变 对象，Optional 对象， 用于不存在值 表示 null
 *
 *  get() 返回所包含的实例
 *
 *  of() 返回包含给定的非空引用Optional 实例
 *  or() 返回所包含的实例，否则为默认值
 *  orNull() 返回所包含的实例（如果存在），否则返回null
 *
 */
public class OptionalTest {

    public static void main(String[] args) {

        Integer value1 = null;
        Integer value2 = new Integer(10);


        Optional<Integer> integerOptional = Optional.fromNullable(value1);

        Optional<Integer> integerOptional1 = Optional.of(value2);

        Integer s = integerOptional.get();
        System.out.println(s);


        Integer result = integerOptional1.get();
        System.out.println(result);



    }

}
