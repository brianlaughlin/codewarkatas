package kata.kyu8.firstnonconsecutivenumber;

public class FirstNonConsecutive {

    static Integer find(final int[] array) {

        int counter = array[0];

        for (int i = 1; i < array.length; i++) {
            counter++;
            if (counter != array[i]) return array[i];
        }

        return null;
    }
}
