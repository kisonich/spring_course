package habernate_one_to_many_uni.entity;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name1;

    @Column(name = "surname")
    private String surname;

    @Column(name = "salary")
    private int salary;

///////// Uni direction/////////////
//    @ManyToOne(cascade = CascadeType.ALL)
////    @JoinColumn(name = "department_id")// столебец ForeignKey
//    private Department department;
///////// Uni direction/////////////

    public Employee() {
    }
    public Employee(String name1, String surname, int salary) {
        this.name1 = name1;
        this.surname = surname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

//    public Department getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Department department) {
//        this.department = department;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name1='" + name1 + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
// id не прописываем в конструктор так как он инкреминтируется автоматически
// id создается getter setter
// где прописываем ForeignKey то называется source таблици, а department target таблица
// ForeignKey находится в таблице где находится @Many....