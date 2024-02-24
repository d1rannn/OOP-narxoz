package Lambda.Person;
import java.util.*;

public class Database
{
    private List<Person> personList = new ArrayList<>();

    public void addPerson(Person person){
        personList.add(person);
    }

    public void printYoungPeopleNames() {
        List<Person> youngPeople = new ArrayList<>();

        for (Person person : personList) {
            if (person.getAge() >= 18 && person.getAge() <= 30) {
                youngPeople.add(person);
            }
        }

        Collections.sort(youngPeople, (a, b) -> a.getName().compareToIgnoreCase(b.getName()));

        for (Person person : youngPeople) {
            System.out.println(person.getName());
        }
    }
}
