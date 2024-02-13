package OOP.Lesson12.Student;

public class Student
{
    int id;
    String name;
    String surname;
    double gpa;

    public Student(int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getStudentData () {
        return "ID: " + id + ", Full Name: " + name  + " " + surname + ", GPA: " + gpa;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0) {
            this.gpa = gpa;
        } else System.out.println("Error");
    }
}
