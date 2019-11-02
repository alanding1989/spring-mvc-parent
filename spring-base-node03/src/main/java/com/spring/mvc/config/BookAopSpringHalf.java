package com.spring.mvc.config;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class BookAopSpringHalf implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Method Before ...");
        Object obj = methodInvocation.proceed();
        System.out.println("Method After ...");
        return obj;
    }
}
