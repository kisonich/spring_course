package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcut {
    @Pointcut("execution(* a1111111111111*(..))") // get
    public void allAddMethod(){}

}
