package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

         UniLibrary uniLibrary= context.getBean("uniLibrary", UniLibrary.class);// Вызываем/получаем бин
        Book book = context.getBean("book",Book.class);

        uniLibrary.getBook();
        uniLibrary.addBook("Nik",book); // С помощью Join point можно добавить эти значения
        uniLibrary.addDVD();


//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary",SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();////////// Обязательно закрывать контекст
    }
}

