package hibernate_one_to_one.entity;

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

    @Column(name = "department")
    private String department;

    @Column(name = "salary")
    private int salary;

    @OneToOne(cascade = CascadeType.ALL)//Если удляем работника то связанные с ним детали тоже удаляются  // cascade применим не для всех отношений. НАпример если "один" ко "многим" то удалени 1 из "многих" привелет к удалению "один"
    @JoinColumn(name = "details_id")// На основе каких плей строить эти отношения // связь между классами.
    private Detail empDetail;

    public Employee() {
    }

    public Employee(String name, String surname, String department, int salary) {
        this.name1 = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    // Переопределили метод toString
    @Override
    public String toString() {
        return "hibernate_test{" +
                "id=" + id +
                ", name='" + name1 + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Detail getEmpDetail() {
        return empDetail;
    }

    public void setEmpDetail(Detail empDetail) {
        this.empDetail = empDetail;
    }
}
// id не прописываем в конструктор так как он инкреминтируется автоматически
// id создается getter setter