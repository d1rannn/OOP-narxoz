package StreamAPI.PersonList;
import java.util.*;
import java.util.stream.*;

public class PersonFilter
{
    public List<Person> filterPersons(List<Person> persons){
        return persons.stream()
                .filter(person -> person.getCity().equals("Almaty"))
                .filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());
    }
}
