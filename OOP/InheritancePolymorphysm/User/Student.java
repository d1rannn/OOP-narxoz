package OOP.InheritancePolymorphysm.User;

public class Student extends User
{
    private double gpa;
    private String courses [] = new String [100];
    private int indexOfCourse = 0;

    public Student(int id, String login, String password, String name, String surname, double gpa, String[] courses, int indexOfCourse) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
        this.courses = courses;
        this.indexOfCourse = indexOfCourse;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int getIndexOfCourse() {
        return indexOfCourse;
    }

    public void setIndexOfCourse(int indexOfCourse) {
        this.indexOfCourse = indexOfCourse;
    }

    public void addCourse(String course){
        courses[indexOfCourse] = course;
        indexOfCourse++;
    }

    public void getData(){
        System.out.println("ID:"+id+". FULL NAME: "+name + surname+". LOGIN: "+login+". PASSWORD: "+password+". GPA: "+gpa+" ");
        System.out.println("COURSES");
        for (int i = 0; i < indexOfCourse; i++) {
            System.out.println(courses[i]);
        }
    }
}
