package Lambda.BestStudent;

public class Student
{
    private String fullName;
    private int age;
    private double gpa;
    private int height;

    public Student(String fullName, int age, double gpa, int height) {
        this.fullName = fullName;
        this.age = age;
        this.gpa = gpa;
        this.height = height;
    }

    public Student() {
        this.fullName = "";
        this.age = 0;
        this.gpa = 0.0;
        this.height = 0;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
