package spring_IoC_DI;

//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class ScopePrototype {
//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
//
//        ///////// Проверяем что две ссылки ссылаются на один бин ////
//        Dog myDog = context.getBean("myPet",Dog.class);
//        myDog.setName("qwe");
//        Dog yourDog = context.getBean("myPet",Dog.class);
//        yourDog.setName("dsaasd");
//        System.out.println(myDog.getName()); // брем геттеры чтоб сосдался 2 бина scope prototype
//        System.out.println(yourDog.getName());
//        System.out.println("Переменная ссылается на один обьект  " + (myDog==yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);
//        ///////// Проверяем что две ссылки ссылаются на один бин////
//        context.close();
//
//    }
//
//}
// Создали Сприн контейнер который получает из applicationContext2 IoC бин
// Pattern singleton - scope  по умолчанию