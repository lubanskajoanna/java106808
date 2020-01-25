import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Person person = new Person();
        person.pesel = 95;
        person.imie = "Aneta";
        Map<Integer, Person> mapPerson =new HashMap<Integer,Person>();
        mapPerson.put(person.pesel,person);

        Person findedPerson = mapPerson.get(95);
        System.out.println("Imie to: " + findedPerson.imie + ", zaś PESEL to: " + findedPerson.pesel);
    }
}
