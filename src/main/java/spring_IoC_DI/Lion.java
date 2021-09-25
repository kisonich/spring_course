package spring_IoC_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

//@Component("lionBean") // указали id бина// Добавили id бина в класс ConfigAnnotations1.
public class Lion implements Pet{
public Lion (){
    System.out.println("Lion bean is created");
}


@Override
    public void say(){
        System.out.println("rrrrrrr ");
    }

}
