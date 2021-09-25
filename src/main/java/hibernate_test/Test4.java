package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class) // Указываем класс который имеет специальные анатации для рабоы с БД
                .buildSessionFactory(); // Метод который строис SessionFactory
        try {
            Session session = sessionFactory.getCurrentSession();// Создаем сессию(подключение к базе)
            session.beginTransaction(); // Открываем транзакцию .// обязательно
//////////////// измеиение Java обьектов(работников)
//            Employee employee = session.get(Employee.class, 1); // Выбрали обьект под id 1
//            employee.setSalary(340000);
//            System.out.println(employee + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

            session.createQuery("update Employee set  salary = 170560 " + "where name1 = 'Anton'") // Создаем запрос для нескольких полей
                    .executeUpdate();

//////////////// измеиение Java обьектов(работников)
            session.getTransaction().commit(); // закрыли транзакцию.// обязательно

        }finally {
            sessionFactory.close();


        }
    }
}
// try block-нужен если выбросится exception то обязательно закрылся sessionFactory
// Использовать транзакции для всех действий
// В запросах пишем название полей из приложения\ класса Employee