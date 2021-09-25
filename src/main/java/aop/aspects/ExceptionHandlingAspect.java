package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(50)
public class ExceptionHandlingAspect {
    @Before("aop.aspects.MyPointcut.allAddMethod()")
    public void beforeExceptionHandlingAdvice(){
        System.out.println("beforeExceptionHandlingAdvice : catch " + "exception when try get book/ DVD ");
        System.out.println("========================================");
    }
}
