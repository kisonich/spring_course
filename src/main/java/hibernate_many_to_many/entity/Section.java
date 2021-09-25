package hibernate_many_to_many.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "section")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;

//    ////// Прописываем связь /////////////////////////
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "child_section",joinColumns = @JoinColumn(name = "section_id")//joinColumns прописываем с помощью какого столбца таблица child_section с таблицей child
//            ,inverseJoinColumns = @JoinColumn(name = "child_id") ) // с помощью какого столбца child_section таблица будет связана с таблицей section
//    List<Child> children = new ArrayList<>();
//    ////// Прописываем связь /////////////////////////


    @ManyToMany
    Set<Child> children;

//    Set<Child> children;





    public Section() {
    }

    public Section( String name) {
        this.name = name;
    }

    public void addChildToSection(Child child){
      if (children ==null){
          children = new HashSet<Child>() {
          };
      }
      children.add(child);
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

    public Set<Child> getChildren() {
        return this.children;
    }

    public void setChildren(Set<Child> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Section{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
