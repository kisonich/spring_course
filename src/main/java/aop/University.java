package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class University {
    private List <Student> students = new ArrayList<>();

    public void addStudents(){
        Student student1 = new Student("Nik",2,8.1);
        Student student2 = new Student("PPP",4,3.2);
        Student student3 = new Student("LLL",3,9.3);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }
    public List<Student> getStudents(){
        System.out.println("Начало работы метода getStudent");
        System.out.println(students.get(4)); // Выбрасываем исключение

        System.out.println("information from method getStudents :  ");
        System.out.println(students);
        return students;
    }
}
