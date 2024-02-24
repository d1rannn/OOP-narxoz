package StreamAPI.Employee;
import java.util.*;
import java.util.stream.*;

public class EmployeeStream
{
    public static void printUniqueLastNames(List<Employee> employees){
        employees.stream()
                .map(Employee::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    public static double calculateAverageSalaryOfEmployeesYoungerThan30(List<Employee> employees){
        return employees.stream()
                .filter(employee -> employee.getAge() < 30)
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
    }

    public static double findMaximumSalaryOfEmployeesOlderThan50( List<Employee> employees){
        return employees.stream()
                .filter(employee -> employee.getAge() > 50)
                .mapToDouble(Employee::getSalary)
                .max()
                .orElse(0.0);
    }

    public static void printAverageSalaryByAge(List<Employee> employees) {
        Map<Integer, Double> averageSalaryByAge = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge, Collectors.averagingDouble(Employee::getSalary)));

        averageSalaryByAge.forEach((age, averageSalary) ->
                System.out.println("Average salary for age " + age + ": " + averageSalary));
    }
}
