package spring_IoC_DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("spring_IoC_DI")
public class MyConfig {



    ///// Оба бина синглетоне,сразу будут созданы бины и помещены в контейнер от туда их получим
@Bean
@Scope("prototype")
    public Pet catBeannn(){ // id бина
        return new Cat();
    }
    @Bean
public Person personBeannn(){ // внедряем зависимость используя конструктор который принимат обьект Pet
    return new Person(catBeannn());
    }
    @Bean
    public Lion lionBeannn(){
    return new Lion();
    }
}


// конфиг класс
// Второй способ внедрения не спользует сканирование и поиск бинов(убираем @Component)// Все бини и DI описываем в конфиг классе (Убираем @Autowired)

/////22 урок