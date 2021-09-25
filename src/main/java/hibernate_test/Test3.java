package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class) // Указываем класс который имеет специальные анатации для рабоы с БД
                .buildSessionFactory(); // Метод который строис SessionFactory
        try {
            Session session = sessionFactory.getCurrentSession();// Создаем сессию(подключение к базе)
            session.beginTransaction(); // Открываем транзакцию .// обязательно
//////////////// получение Java обьектов(работников)
            List<Employee> employees = session.createQuery("from Employee " + "where name1 = 'Nik' and salary > 650") // Поместили работников в список// создаем запрос
                    .getResultList(); // Получаем результат запроса

            for (Employee e :employees) // выводим работника на экран
                System.out.println(e);

//////////////// получение Java обьектов(работников)
            session.getTransaction().commit(); // закрыли транзакцию.// обязательно

        }finally {
            sessionFactory.close();


        }
    }
}
// try block-нужен если выбросится exception то обязательно закрылся sessionFactory
// Использовать транзакции для всех действий
// В запросах пишем название полей из приложения\ класса Employee