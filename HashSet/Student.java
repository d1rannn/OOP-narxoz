package HashSet;
import java.util.*;

public class Student
{
    private String name;
    private Set<String> courses;

    public Student(String name, Set<String> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getCourses() {
        return courses;
    }

    public void setCourses(Set<String> courses) {
        this.courses = courses;
    }

    public void addCourses(String course){
        courses.add(course);
    }

    public void removeCourses(String course){
        courses.remove(course);
    }

    public void listCourses(){
        for (String s: courses){
            System.out.println("\"" + s + "\"");
        }
    }
}
