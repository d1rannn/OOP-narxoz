package Generics;
import java.util.*;

public class StudentList <T extends Student>
{
    private List<T> students = new ArrayList<>();

    public StudentList(List<T> students) {
        this.students = students;
    }
    public StudentList(){

    }
    public void addStudent(T student){
        students.add(student);
    }
    public void removeStudent(T student){
        students.remove(student);
    }
    public T getHighestGpaStudent(){
        double theBest = students.get(0).getGpa();
        T thebestStudent = null;
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getGpa() > theBest){
                theBest = students.get(i).getGpa();
                thebestStudent = students.get(i);
            }
        }
        return thebestStudent;
    }
    public void sortByLastName() {
        students.sort(Comparator.comparing(Student::getLastName));
    }

    public List<T> getStudents() {
        return students;
    }

    public void swap(int index1, int index2) {
        if (index1 >= 0 && index1 < students.size() && index2 >= 0 && index2 < students.size()) {
            Collections.swap(students, index1, index2);
        } else {
            System.out.println("Invalid indices for swap.");
        }
    }
}
