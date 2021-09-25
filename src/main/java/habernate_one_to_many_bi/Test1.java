package habernate_one_to_many_bi;



import habernate_one_to_many_bi.entity.Department;
import habernate_one_to_many_bi.entity.Employee;
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

//            //////////////////////// OneToOne Bi - directional отношеня////////////////////////////////////
//            session = sessionFactory.getCurrentSession();// Создаем сессию(подключение к базе)
//            Department dep = new Department("Team Lead",300,1200);
//
//            Employee emp1 = new Employee("Nikita","KisSold",155000);
//            Employee emp2 = new Employee("Anton","Vonok",210000);
//            Employee emp3 = new Employee("Viktor","Petrov",120000);
//            Employee emp4 = new Employee("Pavel","Azarenko",240000);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp3);
//            dep.addEmployeeToDepartment(emp4);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction(); // Открываем транзакцию .// обязательно
//            session.save(dep);
//
//            session.getTransaction().commit(); // Закрыли транзакцию.// обязательно
//            System.out.println("Добавление выполнилось!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");




            session = sessionFactory.getCurrentSession();// Создаем сессию(подключение к базе)
            session.beginTransaction(); // Открываем транзакцию .// обязательно
            System.out.println("Get department");
            Department department = session.get(Department.class,14);
            System.out.println("Show department");
            System.out.println(department);
            System.out.println("Show employees of the department");
            System.out.println(department.getEmployees());

            session.getTransaction().commit(); // Закрыли транзакцию.// обязательно
            System.out.println("Добавление выполнилось!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");



//            session = sessionFactory.getCurrentSession();// Создаем сессию(подключение к базе)
//            session.beginTransaction(); // Открываем транзакцию .// обязательно
//            Employee employee = session.get(Employee.class,10);
//            session.delete(employee);
//
//            session.getTransaction().commit(); // Закрыли транзакцию.// обязательно
//            System.out.println("Добавление выполнилось!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }finally {
            session.close(); // Обязательно заакрываем сессию чтобы если выбросятся исключения до commit() то сеессия все равно закрылась
            sessionFactory.close();

//////////////////////// OneToOne Bi - directional отношеня////////////////////////////////////
        }
    }
}
// try block-нужен если выбросится exception то обязательно закрылся sessionFactory
// Использовать транзакции для всех действий
