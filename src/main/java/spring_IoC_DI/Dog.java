package spring_IoC_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("dogBean")
@Scope("prototype")
public class Dog implements Pet {
//    private String name;

    public Dog(){
        System.out.println("Dog bean is created");
    }
    @Override
    public void say(){
        System.out.println("wow wow");
    }
/////// сеттер геттер для того чтобы обращение к контейнеру а тот брал геттеры и prototype создал 2 бина для двух ссылок
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    /////// сеттер геттер для того чтобы обращение к контейнеру а тот брал геттеры и prototype создал 2 бина для двух ссылок

}
