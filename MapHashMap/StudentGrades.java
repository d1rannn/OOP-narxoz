package MapHashMap;
import java.util.*;

public class StudentGrades
{
    protected Map<String, Integer> grades = new HashMap<>();

    public void addStudent(String name, int grade){
        grades.put(name, grade);
    }
    public void printStudentsAboveGrade(int threshold){
        for (Map.Entry<String, Integer> entry: grades.entrySet()) {
            if(threshold < entry.getValue()){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
