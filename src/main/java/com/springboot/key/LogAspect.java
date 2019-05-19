package com.springboot.key;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import sun.reflect.generics.tree.MethodTypeSignature;

import java.lang.reflect.Method;

/**
 * 引包问题
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.springboot.key.Action)")
    public void annotationPointCut() {
    }

    public void after(Joinpoint joinPoint) {
        MethodSignature signature=(MethodSignature)joinPoint.getStaticPart();
        Method method=signature.getMethod();
        Action action=method.getAnnotation(Action.class);
        System.out.println("注解拦截"+action.name());

    }

    public void before(Joinpoint joinpoint){
        MethodSignature signature=(MethodSignature)joinpoint.getStaticPart();
        Method method=signature.getMethod();
        System.out.println("方法规则拦截"+method.getName());
    }


}
