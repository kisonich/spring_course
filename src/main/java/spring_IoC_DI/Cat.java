package spring_IoC_DI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("catBean")
public class Cat implements Pet{
    private String name;
    public Cat (){
        System.out.println("Cat bean is created");
    }
/////// сеттер геттер для того чтобы обращение к контейнеру а тот брал геттеры и prototype создал 2 бина для двух ссылок
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
/////// сеттер геттер для того чтобы обращение к контейнеру а тот брал геттеры и prototype создал 2 бина для двух ссылок
    @Override
    public void say() {
        System.out.println("mew mew");
    }
    ///////// init-method///////////
//    @PostConstruct
//    public void init(){
//        System.out.println("Class Cat : init method");
//    }
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Class Cat : destroy method");
//    }
    ///////// init-method///////////
}
