package MapHashMap;
import java.util.*;

public class University
{
    protected HashMap<String, Integer> studentList = new HashMap<>();

    public HashMap<String, Integer> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student){
        studentList.put(student.getName(), student.getGrade());
    }
}
