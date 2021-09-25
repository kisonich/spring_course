package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class) // Указываем класс который имеет специальные анатации для рабоы с БД
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory(); // Метод который строис SessionFactory

        Session session = null; // Обьявляем сессию
        try {

            //////////////////////// OneToOne Uni - directional отношеня////////////////////////////////////


//            Session session = sessionFactory.getCurrentSession();// Создаем сессию(подключение к базе)
//            Employee employee = new Employee("Nikita", "KisSold","IT",140000);
//            Detail detail = new Detail("Moscow","7893434654","qwe@mail.com");
//            employee.setEmpDetail(detail);// получаем detail о нашем employee
//            session.beginTransaction(); // Открываем транзакцию .// обязательно
//            session.save(employee);// Сохраняем работника с параметрами employee с помощью CascadeType и OneToOne Relation
//            session.getTransaction().commit(); // Закрыли транзакцию.// обязательно
//            System.out.println("Добавление выполнилось!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + employee);

//            =========================================================
//
//            Session session = sessionFactory.getCurrentSession();// Создаем сессию(подключение к базе)
//            Employee employee = new Employee("Ivan", "Sidorov","HR",110000);
//            Detail detail = new Detail("Moscow","7893456546","tttttttt@mail.com");
//            employee.setEmpDetail(detail);// получаем detail о нашем employee
//            session.beginTransaction(); // Открываем транзакцию .// обязательно
//            session.save(employee);// Сохраняем работника с параметрами employee с помощью CascadeType и OneToOne Relation
//            session.getTransaction().commit(); // Закрыли транзакцию.// обязательно
//            System.out.println("Добавление выполнилось!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + employee);
//=================================================================================

            session = sessionFactory.getCurrentSession();// Создаем сессию(подключение к базе)
            session.beginTransaction(); // Открываем транзакцию .// обязательно
            Employee employee = session.get(Employee.class,2);//*
//            System.out.println(employee.getEmpDetail()); // Выводим детали работника*
            session.delete(employee); // Удаляем обьект по id* // Благодаря CascadeType удалится не только employee под id  но и его detail которые связаны FK

            session.getTransaction().commit(); // Закрыли транзакцию.// обязательно
            System.out.println("Добавление выполнилось!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }finally {
            session.close(); // Обязательно заакрываем сессию чтобы если выбросятся исключения до commit() то сеессия все равно закрылась
            sessionFactory.close();

//////////////////////// OneToOne Uni - directional отношеня////////////////////////////////////
        }
    }
}
// try block-нужен если выбросится exception то обязательно закрылся sessionFactory
// Использовать транзакции для всех действий