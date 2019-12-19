package com.ning.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class MyAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("o:"+o);
        System.out.println("method:"+method);
        System.out.println("objects:"+objects);
        System.out.println("o1:"+o1);
        System.out.println("执行后置通知");
    }
}
