package aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// Используем джава код
@Configuration //означает, что данный класс является конфигурацией
@ComponentScan("aop")
@EnableAspectJAutoProxy // позволяет нам за кулисами использовать Spring AOP Proxy // Далее создаем класс Aspect
public class MyConfig {

}
