package kata.converttimetostring;

public class TimeUtils {
    public static String convertTime(int timeDiff) {
        int day = 0;
        int hour = 0;
        int min = 0;
        int sec = 0;
        int timeRemaining = 0;

        sec = timeDiff % 60;

        timeRemaining = timeDiff / 60; // # of min
        min = timeRemaining % 60;

        timeRemaining = timeRemaining / 60;  // # of hours
        hour = timeRemaining % 24;

        timeRemaining = timeRemaining / 24;  // # of days
        day = timeRemaining;



        String result = builtTime(day, hour, min, sec);

        return result;
    }

    private static String builtTime(int day, int hour, int min, int sec) {
        return
                    Integer.toString(day)
                    + " " +
                    Integer.toString(hour)
                    + " " +
                    Integer.toString(min)
                    + " " +
                    Integer.toString(sec);
    }

    public static String convertTimeILiked(int timeDiff) {

        int minutes = timeDiff  / 60;
        int hours = minutes / 60;
        int days = hours /24;

        return  days + " " + hours%24 + " " + minutes%60 + " " + timeDiff%60;
    }

    public static String convertTimeBest(int timeDiff) {
        String format =  "%s %s %s %s";
        return String.format(format, timeDiff / 86400, timeDiff % 86400 / 3600, timeDiff % 3600 / 60, timeDiff % 60);
    }
}
