package TryCatch.Task3;

public class Main
{
    public static void main(String[] args) {
        Company company1 = new Company("Samsung", null);
        Company company2 = new Company("Apple", new Worker("Steve", "Jobs"));
        Company company3 = new Company("Magnum", null);
        Company company4 = new Company("Huawei", null);
        Company company5 = new Company("IITU", null);
        System.out.println(company1.getData());
        System.out.println(company2.getData());
        System.out.println(company3.getData());
        System.out.println(company4.getData());
        System.out.println(company5.getData());
    }
}
