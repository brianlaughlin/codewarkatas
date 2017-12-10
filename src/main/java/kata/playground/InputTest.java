package kata.playground;

import java.util.Scanner;

public class InputTest {


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your code: ");

        String url = in.next();

        System.out.println("You entered this: " + url);

    }

}
