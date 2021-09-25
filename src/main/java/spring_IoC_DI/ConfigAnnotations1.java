package spring_IoC_DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("personBean",Person.class);
        person.callYourPet();
//        System.out.println(person.getName());
//        System.out.println(person.getAge());
        Lion lion = context.getBean("lionBean",Lion.class);
        lion.say();
//        Dog dog = context.getBean("dogBean",Dog.class);
//        dog.say();
//        Cat cat = context.getBean("catBean",Cat.class);
//        cat.say();


        context.close();
    }
}
// Спринг контейнер