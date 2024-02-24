package OOP.Interface.Employee;

public class Employee
{
    protected int id;
    protected String fullName;
    protected int age;

    public Employee(int id, String fullName, int age) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
    }

    public Employee() {
        this.id = 0;
        this.fullName = "";
        this.age = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String toString(){
        return "Employee{id="+id+", fullName='"+fullName+"', age="+age+"}";

    }
}
