package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect // нужно через настройки внедрить фаил в проект (второй урок)
@Order(10) // При выполнении метода getBook() @Order позволит соблюдать порядок в Aspect таким образом будет поддерживаться рорядок в Advice которые содержаться в аспектах
public class LoggingAspect { // При вызове метода getBook сначало происходит логирование информации а потом срабатывал метод






//    //===/=/=/=/=/=/=//=/=//=//==/= комбенирование pointcut
//    // pointcut подходит для всех мтодов кроме returnDVD
//    @Pointcut("execution(* aop.UniLibrary.*(..))") // все методы
//    public void allMethodFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.returnDVD(..))") //**
//    private void returnDVDFromUniLibrary(){}
//
//
//@Pointcut("allMethodFromUniLibrary() && !returnDVDFromUniLibrary()") // все кроме **
//    private void allMethodExceptReturnDVDFromUniLibrary(){}
//
//    @Before("allMethodExceptReturnDVDFromUniLibrary()")
//    public void beforeAllMethodExceptReturnDVDAdvice(){
//        System.out.println("beforeAllMethodExceptReturnDVDAdvice : Log #10");
//    }
//    //===/=/=/=/=/=/=//=/=//=//==/=

    //======================= Коибенирования pointcut
//    @Pointcut("execution(* aop.UniLibrary.get*())") //*
//    private void allGetMethodFromUniLibrary(){}
//
//    @Before("allGetMethodFromUniLibrary()") //*
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice : writing Log #1");
//    }
//
//
//    @Pointcut("execution(* aop.UniLibrary.return*())") //**
//    private void allReturnMethodFromUniLibrary(){}
//
//    @Before("allReturnMethodFromUniLibrary()") //**
//    private void beforeReturnLoggingAdvice() {
//        System.out.println("allReturnMethodFromUniLibrary : writing Log #2");
//    }
//
//// Комбинация 1 и 2 pointcut
//    @Pointcut("allGetMethodFromUniLibrary() || allReturnMethodFromUniLibrary()") //***
//    private void allGetMethodAndAllReturnMethodFromUniLibrary (){ // Подходит под условия 1 и 2 pointcut
//        System.out.println();
//    }
//
//    @Before("allGetMethodAndAllReturnMethodFromUniLibrary()") //**
//    private void beforeAllGetAllReturnLoggingAdvice() {
//        System.out.println("allGetMethodAndAllReturnMethodFromUniLibrary : writing Log #3");
//    }


//============================ Разные примеры урок 6


    // Обьявление pointcut
//    @Pointcut("execution(* get*())")
//    public void allGetMethod(){}

    // Метод который вызывается до метода getBook.
    @Before("aop.aspects.MyPointcut.allAddMethod()") //pointcut///
    // Type advice // указываем перед чем срабатывает этот метод// (в скобках pointcut) вырожение которое описывает когда должен выполниться сквозной код(Advice)
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) { // Сам advice

        // Информация о сигнатуре метода получаем в теле Advice, Advice срабатывает для методов которые соответствуют pointcut////////
         MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod = " + methodSignature.getMethod());

        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getReturnType = " + methodSignature.getReturnType());

        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getName() = " + methodSignature.getName());





        System.out.println("beforeGetLoggingAdvice : Logging " + "tryings to get a book/ DVD ");
        System.out.println("========================================");

    }
    // Метод который вызывается до метода getBook.


//    // Метод проверяет доступ пользователя к библиотетке
//    @Before("allGetMethod()") // принели ссылку pointcut'а
//    public void beforeGetSecurityAdvice(){
//        // Логика метода
//        System.out.println("beforeGetSecurityAdvice : Проверка прав на получение книги/ журнала");
//    }
    // Метод проверяет доступ пользователя к библиотетке

}
//Aspect – это класс, отвечающий за сквозную/служебную функциональность( Проверка прав (security check) Обработка транзакций Обработка исключений Кэширование И т.д.)
// Advice это метод который находится в аспект классе который определяет что должно произойти при вызове метода getBook
// execution - исполнение
// класс сквозной функционал
// Если в pointcut прописать полное имя класса (пакет имя класса метод) то именно тот бин создасться  @Before("execution(public void aop.UniLibrary.getBook())")
// Если прописать так("execution(public void get*())") то выберутся все методы которые начинаются на get (getBook,getDVD)