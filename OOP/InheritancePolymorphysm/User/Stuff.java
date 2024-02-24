package OOP.InheritancePolymorphysm.User;

public class Stuff extends User
{
    private double salary;
    private String[] subjects = new String [100];
    private int indexOfSubject = 0;

    public Stuff(int id, String login, String password, String name, String surname, double salary, String[] subjects, int indexOfSubject) {
        super(id, login, password, name, surname);
        this.salary = salary;
        this.subjects = subjects;
        this.indexOfSubject = indexOfSubject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int getIndexOfSubject() {
        return indexOfSubject;
    }

    public void setIndexOfSubject(int indexOfSubject) {
        this.indexOfSubject = indexOfSubject;
    }

    public void addSubject(String subject){
        subjects[indexOfSubject] = subject;
        indexOfSubject++;
    }
    public void getData(){
        System.out.println("ID:"+id+". FULL NAME: "+name + surname+". LOGIN: "+login+". PASSWORD: "+password+". SALARY: "+salary+" ");
        System.out.println("SUBJECTS:");
        for (int i = 0; i < indexOfSubject; i++) {
            System.out.println(subjects[i]);
        }
    }
}
