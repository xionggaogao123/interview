package com.keven.interview.annotation;

import java.lang.annotation.*;

/**
 * @author keven
 * @date 2018-05-14 下午10:33
 * @Description
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Logined {

    String[] others() default {};

}
