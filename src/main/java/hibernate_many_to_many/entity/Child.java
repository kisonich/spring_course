package hibernate_many_to_many.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "children")
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;

//    ////// Прописываем связь /////////////////////////
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "child_section",joinColumns = @JoinColumn(name = "child_id")//joinColumns прописываем с помощью какого столбца таблица child_section с таблицей child
//    ,inverseJoinColumns = @JoinColumn(name = "section_id") ) // с помощью какого столбца child_section таблица будет связана с таблицей section
//    private List<Section> sections = new ArrayList<>();
//    ////// Прописываем связь /////////////////////////


    @ManyToMany
    Set<Section> sections;




    public Child() {
    }

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void addSectionToChild(Section section){
        if (sections == null){
            sections = new HashSet<Section>();
        }
        sections.add(section);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<Section> getSections() {
        return this.sections;
    }

    public void setSections(Set<Section> sections) {
        this.sections = sections;
    }

    @Override
    public String toString() {
        return "Child{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
