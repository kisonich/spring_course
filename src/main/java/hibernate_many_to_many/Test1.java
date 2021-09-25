package hibernate_many_to_many;




import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        System.out.println("testt");








//        SessionFactory sessionFactory = new Configuration() //  Configuration() org.hibernate.cgf
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Child.class) // Указываем класс который имеет специальные анатации для рабоы с БД
//                .addAnnotatedClass(Section.class)
//                .buildSessionFactory(); // Метод который строис SessionFactory
//
//        Session session = null; // Обьявляем сессию
//        try {
////            session = sessionFactory.getCurrentSession();
////
////            Section section1 = new Section ("Football");
////            Child child1 = new Child("Alesha",5);
////            Child child2 = new Child("Katya",4);
////            Child child3 = new Child("Dasha",6);
////
////            section1.addChildToSection(child1);
////            section1.addChildToSection(child3);
////            section1.addChildToSection(child2);
////
////            session.beginTransaction();
////            //// Logging ///////
////            session.save(section1); // child сохранятся вместе с section благодаря CascadeType.ALL
////
////            session.getTransaction().commit();
////            System.out.println("Done!!!!!!!!!!!!!");
//            //**************************************************************************
////
////            session = sessionFactory.getCurrentSession();
////
////            Section section1 = new Section ("Volleyball");
////            Section section2 = new Section ("Tennis");
////            Section section3 = new Section ("sewing pool");
////
////            Child child1 = new Child("Nik",5);
////
////            child1.addSectionToChild(section1);
////            child1.addSectionToChild(section2);
////            child1.addSectionToChild(section3);
////
////            session.beginTransaction();
////            //// Logging ///////
////            session.save(child1); // child сохранятся вместе с section благодаря CascadeType.ALL
////
////            session.getTransaction().commit();
////            System.out.println("Done!!!!!!!!!!!!!");
//            ////////*************************************************//////////////////////
//
//
////            session = sessionFactory.getCurrentSession();
////            session.beginTransaction();
////
////            Section section = session.get(Section.class,1);
////            System.out.println(section);
////            System.out.println(section.getChildren());
////
////            session.getTransaction().commit();
////            System.out.println("Done!!!!!!!!!!!!!");
//            //*************************************/////////////////////////////////
//
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//
//            Child child = session.get(Child.class,4);
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!!!!!!!!!!!");
//        }finally {
//            session.close(); // Обязательно заакрываем сессию чтобы если выбросятся исключения до commit() то сеессия все равно закрылась
//            sessionFactory.close();
//// урок 18!!!!!!!!!!!!!!!!!!
//        }
    }
}
// try block-нужен если выбросится exception то обязательно закрылся sessionFactory
// Использовать транзакции для всех действий
