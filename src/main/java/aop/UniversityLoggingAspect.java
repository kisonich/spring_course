package aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentLoggingAdvice(){
//        System.out.println("beforeGetStudentLoggingAdvice : логируем получение " + "списка студентов ЧЕРЕЗ методом getStudent");
//    }
//
//        @AfterReturning(pointcut = "execution(* getStudents())"
//                ,returning = "students") // returning это тот результат который который будет возращать метод подходящий под pointcut
//        public void afterReturningGetStudentLoggingAdvice(List<Student>students){ // Указали в параметры этого Advice возращаемые значения метода getStudents можно работать с output
//        Student firstStudent = students.get(0);
//
//        String name = firstStudent.getName();
//        name = "Mr. " + name;
//        firstStudent.setName(name);// назначили новое имя
//
//         double avgGrade = firstStudent.getAverageGrade();
//         avgGrade = avgGrade + 1;
//         firstStudent.setAverageGrade(avgGrade);
//
//            System.out.println("afterReturningGetStudentLoggingAdvice : логируем получение " + "списка студентов ПОСЛЕ методом getStudent");
//        }




//    @AfterThrowing(pointcut = "execution (* getStudents())" //pointcut
//    ,throwing = "execution") // Получаем информациб о исключении который был выброшен в таргет методе, добавив второй параметр
//    public void afterTrowingGetStudentLoggingAdvice(Throwable execution){ // advice
//        System.out.println(" afterTrowingGetStudentLoggingAdvice: Логируем выброс исключения" + execution);
//    }



    @After("execution (* getStudents())")
    public void afterGetStudentLoggingAdvice(){
        System.out.println("afterGetStudentLoggingAdvice : Логируем нормальное окончание работы метода или выброс исключения ");
    }
}
// Test2
//   @AfterReturning возращает обновленный пезультат