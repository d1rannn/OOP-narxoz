package OOP.Interface.Worker;

class Programmer implements Worker
{
    int id;
    String nickname;
    int salary;
    int bonusSalary;
    double KPIValue;

    public Programmer(int id, String nickname, int salary, int bonusSalary, double KPIValue) {
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.KPIValue = KPIValue;
    }

    public Programmer() {
        this.id = 0;
        this.nickname = "";
        this.salary = 0;
        this.bonusSalary = 0;
        this.KPIValue = 0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public int getSalary() {
        return (int) (salary + KPIValue*bonusSalary);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getKPIValue() {
        return KPIValue;
    }

    public void setKPIValue(double KPIValue) {
        this.KPIValue = KPIValue;
    }

    @Override
    public String getWorkerData() {
        return "ID: "+id+". NICKNAME: "+nickname+". SALARY: "+salary+". BONUS SALARY: "+bonusSalary+". KPI VALUE: "+KPIValue+"";
    }
}
