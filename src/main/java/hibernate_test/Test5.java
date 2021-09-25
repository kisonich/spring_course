package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class) // Указываем класс который имеет специальные анатации для рабоы с БД
                .buildSessionFactory(); // Метод который строис SessionFactory
        try {
            Session session = sessionFactory.getCurrentSession();// Создаем сессию(подключение к базе)
            session.beginTransaction(); // Открываем транзакцию .// обязательно
//////////////// Удаление Java обьектов(работников)
            //            Employee employee = session.get(Employee.class,1 );// получили обьект по id
            //            session.delete(employee);
            session.createQuery("delete  Employee "+ "where name1 = 'Anton'").executeUpdate();

//////////////// Удаление Java обьектов(работников)
            session.getTransaction().commit(); // закрыли транзакцию.// обязательно
            System.out.println("Done!!!!!!!!!!");

        }finally {
            sessionFactory.close();


        }
    }
}
// try block-нужен если выбросится exception то обязательно закрылся sessionFactory
// Использовать транзакции для всех действий
// В запросах пишем название полей из приложения\ класса Employee
