package com.keven.interview.aspect;

import com.keven.interview.annotation.Logined;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author keven
 * @date 2018-05-14 下午10:34
 * @Description
 */
@Aspect
@Component
public class LoginedAspect {


    @Around(value = "@annotation(logined)")
    public Object loginCheck(ProceedingJoinPoint joinPoint, Logined logined) throws Throwable {
        // 获取到 使用了注解的方法的参数
        Object[] args = joinPoint.getArgs();
        // 获取到 使用了注解的方法 的 注解的参数， 这里面 根据测试类 是 username, password
        String[] otherStrings = logined.others();
        // 执行使用注解方法 并返回信息
        Object ret = joinPoint.proceed();

        //核心 逻辑
        return null;
    }


}
