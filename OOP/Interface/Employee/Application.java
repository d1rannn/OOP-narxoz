package OOP.Interface.Employee;

public class Application
{
    Employee[] employees = new Employee[1000];
    int count = 0;

    public void addEmployee(Employee e){
        employees[count] = e;
        count++;
    }

    public void deleteEmployee(int index){
        employees[index] = null;
    }

    public void printEmployee(){
        String s = "";
        for (int i = 0; i < count; i++) {
            if(employees[i] != null){
                s = employees[i].toString();
                System.out.println(s);
            }
        }
    }

    public Employee oldestEmployee(){
        Employee oldestEmployee = employees[0];
        int oldest = oldestEmployee.age;
        for (int i = 0; i < count; i++) {
            if(employees[i].getAge() > oldest){
                oldestEmployee = employees[i];
                oldest = employees[i].getAge();
            }
        }
        return oldestEmployee;
    }

    public Employee smallestEmployee(){
        Employee smallestEmployee = employees[0];
        int smallest = smallestEmployee.age;
        for (int i = 0; i < count; i++) {
            if(employees[i].getAge() < smallest){
                smallestEmployee = employees[i];
                smallest = employees[i].getAge();
            }
        }
        return smallestEmployee;
    }

    public Employee search(String fullName){
        Employee temp = employees[0];
        String fio = temp.fullName;
        for (int i = 0; i < count; i++) {
            if(fio.contains(employees[i].getFullName())){
                temp = employees[i];
                break;
            }
        }
        return temp;
    }

}
