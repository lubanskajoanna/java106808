import java.util.*;

public class Main {

    public static void main(String[] args) {
        People people = new People(10,"Joanna","Lubanska");
        People people2 = new People(20 , "Magda","Zubala");
        People people3 = new People(30 , "Antek","Foremniak");

        List<People> peopleList = new ArrayList<>();
        peopleList.add(people);
        peopleList.add(people2);
        peopleList.add(people3);

        for (People temp: peopleList) {
           System.out.println(temp.PrintInfo());
        }

        peopleList.sort(Comparator.comparingInt(a -> a.wiek));
        Collections.reverse(peopleList);
        for (People temp: peopleList) {
            System.out.println(temp.PrintInfo());
        }

        peopleList.sort(Comparator.comparing(a -> a.nazwisko));
        Collections.reverse(peopleList);
        for (People temp: peopleList) {
            System.out.println(temp.PrintInfo());
        }
    }
}
