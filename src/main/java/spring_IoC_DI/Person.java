package spring_IoC_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    //    @Autowired
//    @Qualifier("catBean") //DI
    private Pet pet;
    // внедрение строк и других значений//////  /
//    @Value("asdasdas")
    private String name;
    //    @Value("22")
    private int age;

// конструктор для DI использующмй анатации
////    @Autowired // Внедрение зависимости DI// Аннатация прописана на конструкторе, ищет подходящие бины по ТИПУ, в конструкторе внедряется зависимость тип Pet, Спринг контейнер находит созданные бины с ТИПОМ Pet
//        public Person(@Qualifier("lionBean") Pet pet) {
//        System.out.println("Person bean is created ");
//        this.pet = pet;
//}
    public Person(Pet pet) { // конструктор для DI который использующий java code
        System.out.println("Person bean is created ");
        this.pet = pet;

//        /////// DI с помощью конструктора ///////
    }

    //========= внедрение через сеттер
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }
    //==================================


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // внедрение строк и других значений///////\\\\\\\\\\\\\|||\\

//    public Person() {
//        System.out.println("message");
//    }
    public void callYourPet(){
        System.out.println("Hello, Pet");
        pet.say();
    }
}
