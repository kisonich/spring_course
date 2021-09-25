package aop;

public class Student {

    private String name;
    private int course;
    private double averageGrade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", averageGrade=" + averageGrade +
                '}';
    }

    public Student(String name, int course, double averageGrade) {
        this.name = name;
        this.course = course;
        this.averageGrade = averageGrade;


    }
}
