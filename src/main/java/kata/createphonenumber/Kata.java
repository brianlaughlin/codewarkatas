package kata.createphonenumber;

import java.util.Arrays;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {

        String phoneNumber = "";
        for(int aNumber : numbers){
            phoneNumber += String.valueOf(aNumber);
        }

        String formattedPhone = String.format("(%s) %s-%s", phoneNumber.substring(0,3),
                phoneNumber.substring(3,6), phoneNumber.substring(6,10));

        System.out.println(formattedPhone);


        return formattedPhone;
    }

    public static String createPhoneNumberSimple(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
    }

    public static String createPhoneNumberStrem(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
    }
}
