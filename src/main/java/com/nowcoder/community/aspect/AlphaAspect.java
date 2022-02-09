package com.nowcoder.community.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Spring 中AOP 相关术语分析
 * 切面(aspect): 通知+切入点
 * 通知(Advice):切面在某个具体的连接点采取的行为或行动
 * 连接点(joinpoint):程序执行的某个特定位置。
 * 切入点(pointcut):多个连接点的集合。
 * 拦截器是AOP的具体实现
 */
//@Component
//@Aspect
public class AlphaAspect {

    //语法 exection(返回值 包名.类名.方法名(参数))
    @Pointcut("execution(* com.nowcoder.community.service.*.*(..))")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void Before() {
        System.out.println("before");
    }

    @After("pointcut()")
    public void after() {
        System.out.println("after");
    }

    @AfterReturning("pointcut()")
    public void afterReturning() {
        System.out.println("afterReturning");
    }

    @AfterThrowing("pointcut()")
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around before");
        //调用目标组件的方法
        Object obj = joinPoint.proceed();
        System.out.println("around after");
        return obj;
    }
}
