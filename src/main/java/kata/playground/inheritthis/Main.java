package kata.playground.inheritthis;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Person> people;

    public static void main(String[] args) {

        show();

    }

    public static void show() {

        people = new ArrayList<>();
        Father father = new Father();
        Mother mother = new Mother();

        people.add(father);
        people.add(mother);

        people.stream()
                .map(person -> person.toPrettyString())
                .forEach(System.out::println);


    }
}
