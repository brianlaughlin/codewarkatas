package kyu6.meeting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Meeting {
    /*
    Take the string and capitalize all letters.
    Then split the string into an array of strings that hold a first and last name.
    Sort the array by last name and first name
    Then join the array into a string with the following format:
    "(last name, first name)"
     */
    public static String meeting(String s) {
        String[] names = s.toUpperCase().split(";");    // split the string into an array of strings that hold a first and last name
        String[] names_sorted = names.clone();          // clone the array to avoid changing the original array
        java.util.Arrays.sort(names_sorted, (o1, o2) -> {
                    String[] o1_split = o1.split(":");
                    String[] o2_split = o2.split(":");
                    return o1_split[1].compareTo(o2_split[1]) == 0 ? o1_split[0].compareTo(o2_split[0]) : o1_split[1].compareTo(o2_split[1]);

                }
        );
        StringBuilder sb = new StringBuilder();
        for (String name : names_sorted) {
            sb.append("(").append(name.split(":")[1]).append(", ").append(name.split(":")[0]).append(")");

        }
        return sb.toString();

    }

    public static class MeetingBest {
        public static String meeting(String s) {
            return Arrays.stream(s.toUpperCase().split(";")) // split the string into an array of strings that hold a first and last name
                    .map(guest -> guest.replaceAll("(\\w+):(\\w+)", "($2, $1)")) // replace all the names with the format "(last name, first name)"
                    .sorted() // sort the array by last name and first name
                    .collect(Collectors.joining("")); // join the array into a string
        }
    }

}
