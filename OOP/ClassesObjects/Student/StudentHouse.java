package OOP.ClassesObjects.Student;

public class StudentHouse
{
    String name;
    Student[] students = new Student[1000];
    int size = 0;
    int a = 0;

    public StudentHouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent (Student student) {
        students[size] = student;
        size++;
    }

    public void printStudents() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public void deleteStudent(int i) {
        for (int j = 0; j < size; j++) {
            if(a == students[j].id - 1){
                students[j] = null;
            }
        }
    }

    public Student theBestStudent() {
        if (size == 0) {
            return null;
        }

        Student bestStudent = students[0];
        double maxGrade = bestStudent.getGpa();

        for (int i = 1; i < size; i++) {
            if (students[i] != null && students[i].getGpa() > maxGrade) {
                bestStudent = students[i];
                maxGrade = students[i].getGpa();
            }
        }

        return bestStudent;
    }

}
