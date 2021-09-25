package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class TestMain3 {
    public static void main(String[] args) {
        System.out.println("Method TestMain STARTS");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary library = context.getBean("uniLibrary",UniLibrary.class);
        String nameBook = library.returnBook();
        System.out.println("To library return " + nameBook);

        context.close();
        System.out.println("Method TestMain ENDS");


    }
}
