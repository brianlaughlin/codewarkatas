package kata.playground.inheritthis;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListExample {

    ArrayList<Integer> ofNumbers;

    public ArrayListExample() {
        ofNumbers = new ArrayList<>();
        createArray();

    }

    private void createArray(){
        ofNumbers = IntStream.range(0, 10)
                .boxed()
                .collect(Collectors
                        .toCollection(ArrayList::new));
    }

    public ArrayList<Integer> getInput() {

        return ofNumbers;
    }

    public void getArray() {

        ArrayList<Integer> newList = new ArrayList<>(ofNumbers);

        for (Integer num : newList) {
            System.out.println(num);
        }

    }
}
