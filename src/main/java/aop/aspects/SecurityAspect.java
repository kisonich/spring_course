package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {

    @Before("aop.aspects.MyPointcut.allAddMethod()") // принели ссылку pointcut'а
    public void beforeAddSecurityAdvice(){
          System.out.println("beforeGetSecurityAdvice : Проверка прав на получение книги/ DVD");
        System.out.println("========================================");

    }

}
