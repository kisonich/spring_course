package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class) // Указываем класс который имеет специальные анатации для рабоы с БД
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory(); // Метод который строис SessionFactory

        Session session = null; // Обьявляем сессию
        try {

            ////////////////////// OneToOne Bi - directional отношеня////////////////////////////////////
            session = sessionFactory.getCurrentSession();// Создаем сессию(подключение к базе)
            Employee employee = new Employee("Alena", "Nikiforova","IT",120000);
            Detail detail = new Detail("Orenburg","78911111154","bbbbbgggw@mail.com");

            employee.setEmpDetail(detail);// получаем detail о нашем employee
            detail.setEmployee(employee);

            session.beginTransaction(); // Открываем транзакцию .// обязательно
            session.save(detail);// Сохраняем детали
            session.getTransaction().commit(); // Закрыли транзакцию.// обязательно
            System.out.println("Добавление выполнилось!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + employee);

        }finally {
            session.close(); // Обязательно заакрываем сессию чтобы если выбросятся исключения до commit() то сеессия все равно закрылась
            sessionFactory.close();

//////////////////////// OneToOne Bi - directional отношеня////////////////////////////////////
        }
    }
}
// try block-нужен если выбросится exception то обязательно закрылся sessionFactory
// Использовать транзакции для всех действий