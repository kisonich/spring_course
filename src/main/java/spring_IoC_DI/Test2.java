package spring_IoC_DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet",Pet.class);  // ПОлучаем бин из applicationContext// Используем рефлексию(,Pet.class) чтобы в applicationContext подставлять других животных а так как все животные имплементированы интерфейсом Pet проще указать тип Pet
        pet.say();
        context.close(); // закрывать контекст
    }
}
// Создали Сприн контейнер который получает из applicationContext бин DOg или Cat(какой укажем апплКонтекст), но здесь указали их интерфейс Pet