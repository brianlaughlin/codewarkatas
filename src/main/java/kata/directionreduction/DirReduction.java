package kata.directionreduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {

        int northSouth = 0;
        int eastWest = 0;
        int resultLength = 0;
        String direction = "";

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "NORTH":
                    northSouth++;
                    break;
                case "SOUTH":
                    northSouth--;
                    break;
                case "EAST":
                    eastWest++;
                    break;
                case "WEST":
                    eastWest--;
                    break;
            }

        }

        resultLength = Math.abs(northSouth) + Math.abs(eastWest);
        String[] result = new String[resultLength];

        int StringIdx = 0;
        if (result.length == 0) return new String[]{};


        if (northSouth > 0) direction = "NORTH";
        if (northSouth < 0) direction = "SOUTH";
        if (direction.length() > 0) {
            for (int j = 0; j < Math.abs(northSouth); j++) {
                result[StringIdx] = direction;
                StringIdx++;
            }
        }

        direction = "";
        if (eastWest > 0) direction = "EAST";
        if (eastWest < 0) direction = "WEST";
        if (direction.length() > 0) {
            for (int j = 0; j < Math.abs(eastWest); j++) {
                result[StringIdx] = direction;
                StringIdx++;
            }
        }

        return result;
    }

    public static String[] dirReduc2(String[] arr) {

        int index = 0;
        if (arr.length == 0) return new String[]{};

        int i = arr.length;
        String temp = "";
        while (i < arr.length - 1) {
            if (arr[i].equals(arr[i + 1])) i += 2;
            else {
                temp += " " + arr[i];
                i += 1;
            }
//            if (i < )
        }


        String[] result = new String[]{"NORTH", "WEST", "SOUTH", "EAST"};
        return result;
    }

    public static String[] dirReduc3(String[] arr){
        List<String> intputDirReducArray = Arrays.stream(arr)
                .filter(direction -> !direction.equals(""))
                .collect(Collectors.toList());


        int reductionCount = 0;

        if (arr.length > 0) {
            String currentDirection = arr[0];

            for (int i = 1; i < arr.length; i++) {
                currentDirection = arr[i];

                if (isNorth(currentDirection) && isSouth(arr[i - 1]) ||
                        isSouth(currentDirection) && isNorth(arr[i - 1]) ||
                        isWest(currentDirection) && isEast(arr[i - 1]) ||
                        isEast(currentDirection) && isWest(arr[i - 1])) {
                    arr[i - 1] = "";
                    arr[i] = "";
                    reductionCount++;
                }
            }
        }

        List<String> dirReducArray = Arrays.stream(arr)
                .filter(direction -> !direction.equals(""))
                .collect(Collectors.toList());


        if (reductionCount == 0) {
            return dirReducArray.toArray(new String[dirReducArray.size()]);
        }

        return dirReduc(dirReducArray.toArray(new String[dirReducArray.size()]));

    }

    private static boolean isEast(String currentDirection) {
        return currentDirection.equals("EAST");
    }

    private static boolean isWest(String currentDirection) {
        return currentDirection.equals("WEST");
    }

    private static boolean isSouth(String currentDirection) {
        return currentDirection.equals("SOUTH");
    }

    private static boolean isNorth(String currentDirection) {
        return currentDirection.equals("NORTH");
    }
}
