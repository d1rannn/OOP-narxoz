package Lambda.BestStudent;
import java.util.*;

public class StudentAwards implements BestStudent
{
    @Override
    public Student theBest(ArrayList<Student> students){
        return students.get(0);
    }

    public Student theMostGPA(ArrayList<Student> students){
        BestStudent best = (students1) -> {
            Student theBestStudent = students1.get(0);
            double theBestStudentGpa = theBestStudent.getGpa();
            for (int i = 0; i < students1.size(); i++) {
                if (theBestStudentGpa < students1.get(i).getGpa()){
                    theBestStudentGpa = students1.get(i).getGpa();
                    theBestStudent = students1.get(i);
                }
            } return theBestStudent;
        };
        return best.theBest(students);
    }

    public Student theMostAge(ArrayList<Student> students){
        BestStudent old = (students1) -> {
            Student theOldestStudent = students1.get(0);
            int theOldestStudentAge = theOldestStudent.getAge();
            for (int i = 0; i < students1.size(); i++) {
                if (theOldestStudentAge < students1.get(i).getAge()){
                    theOldestStudentAge = students1.get(i).getAge();
                    theOldestStudent = students1.get(i);
                }
            } return theOldestStudent;
        };
        return old.theBest(students);
    }

    public Student theLongestFullName(ArrayList<Student> students){
        BestStudent longest = (students1) -> {
            Student theLongestFullName = students1.get(0);
            String theLongestStudentsFullName = theLongestFullName.getFullName();
            for (int i = 0; i < students1.size(); i++) {
                if(theLongestStudentsFullName.length() < students1.get(i).getFullName().length()){
                    theLongestStudentsFullName = students1.get(i).getFullName();
                    theLongestFullName = students1.get(i);
                }
            }
            return theLongestFullName;
        };
        return longest.theBest(students);
    }

    public Student theHighest(ArrayList<Student> students){
        BestStudent highest = (students1) -> {
            Student theHighestStudent = students1.get(0);
            int theHighestStudentHeight = theHighestStudent.getHeight();
            for (int i = 0; i < students1.size(); i++) {
                if(theHighestStudentHeight < students1.get(i).getHeight()){
                    theHighestStudentHeight = students1.get(i).getHeight();
                    theHighestStudent = students1.get(i);
                }
            }
            return theHighestStudent;
        };
        return highest.theBest(students);
    }
}
