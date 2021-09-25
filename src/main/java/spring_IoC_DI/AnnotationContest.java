package spring_IoC_DI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationContest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat = context.getBean("catBeannn",Pet.class);
//        Pet cat2 = context.getBean("catbeannn",Pet.class);
//        cat.say();
//        cat2.say();

        Person person = context.getBean("personBeannn",Person.class);
        person.callYourPet();

        Lion lion =context.getBean("lionBeannn",Lion.class);
        lion.say();

        context.close();
    }
}
// спринг контейнер