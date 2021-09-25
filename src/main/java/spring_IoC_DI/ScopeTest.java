package spring_IoC_DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext4.xml");

        Cat cat = context.getBean("catBean",Cat.class);
        cat.say();
////// prototype в классе дог
//        Dog dog = context.getBean("dogBean",Dog.class);
//        Dog dog2 = context.getBean("dogBean",Dog.class);
//        System.out.println("Проверяется ссылается ли на один обьект" + (dog==dog2));
//        System.out.println(dog);
//        System.out.println(dog2);
        context.close();


    }
}
//  Используем scope prototype чтоб 2 ссылки ссылались на разные бины