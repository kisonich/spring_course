package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class) // Указываем класс который имеет специальные анатации для рабоы с БД
                .buildSessionFactory(); // Метод который строис SessionFactory
        try {
            Session session = sessionFactory.getCurrentSession();// Создаем сессию(подключение к базе)
            Employee emp = new Employee("Nik", "KisSold","IT",120560); // Добавляем строку в таблицу с значением полей обьекта
            session.beginTransaction(); // Открываем транзакцию .// обязательно
            session.save(emp); // insert/ сохраняем обьект БД
            session.getTransaction().commit(); // закрыли транзакцию.// обязательно
            System.out.println("Добавление выполнилось!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println(emp);
        }finally {
            sessionFactory.close();


        }
    }
}
// try block-нужен если выбросится exception то обязательно закрылся sessionFactory
// Использовать транзакции для всех действий