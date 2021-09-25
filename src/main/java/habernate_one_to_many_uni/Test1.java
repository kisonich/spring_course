package habernate_one_to_many_uni;




import habernate_one_to_many_uni.entity.* ;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class) // Указываем класс который имеет специальные анатации для рабоы с БД
                .addAnnotatedClass(Department.class)
                .buildSessionFactory(); // Метод который строис SessionFactory

        Session session = null; // Обьявляем сессию
        try {

//            //////////////////////// OneToOne Uni - directional отношеня////////////////////////////////////
//            session = sessionFactory.getCurrentSession();// Создаем сессию(подключение к базе)
//            Department dep = new Department("IT",300,1200);
//
//            Employee emp1 = new Employee("Nikita","KisSold",170000);
//            Employee emp2 = new Employee("Viktor","Azarenko",210000);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction(); // Открываем транзакцию .// обязательно
//            session.save(dep);
//
//            session.getTransaction().commit(); // Закрыли транзакцию.// обязательно
//            System.out.println("Добавление выполнилось!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");




//            session = sessionFactory.getCurrentSession();// Создаем сессию(подключение к базе)
//            session.beginTransaction(); // Открываем транзакцию .// обязательно
//            Department department = session.get(Department.class,1);
//            System.out.println(department);
//            System.out.println(department.getEmployees());
//
//            session.getTransaction().commit(); // Закрыли транзакцию.// обязательно
//            System.out.println("Добавление выполнилось!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");



            session = sessionFactory.getCurrentSession();// Создаем сессию(подключение к базе)
            session.beginTransaction(); // Открываем транзакцию .// обязательно
            Employee employee = session.get(Employee.class,20);
            session.delete(employee);


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
