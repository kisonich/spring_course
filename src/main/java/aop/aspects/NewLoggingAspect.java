package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) // Связь с таргет методом
            throws Throwable {

        System.out.println("aroundReturnBookLoggingAdvice : to library TRY return book");
        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed(); // Сохраняем результат метода returnBook// Самостоятельно вызываем метод returnBooktargetMethodResult
        targetMethodResult = "изменили значение в таргет методе";
         long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice : to library return book!");

        long result = end - begin;
                System.out.println(result);
        return targetMethodResult;
    }
}
// Object = String