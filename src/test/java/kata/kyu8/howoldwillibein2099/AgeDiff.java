package kata.kyu8.howoldwillibein2099;

public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        if (birth == yearTo) return "You were born this very year!";
        if (birth < yearTo) {
            if (yearTo - birth == 1) return String.format("You are %d year old.", yearTo - birth);
            else return String.format("You are %d years old.", yearTo - birth);
        }
        if(birth - yearTo == 1){
            return "You will be born in 1 year.";
        } else return String.format("You will be born in %d years.", birth - yearTo);
    }

    public static String CalculateAgeSimple(int birth, int year) {
        final int age = year - birth;
        return
                age == 0 ? "You were born this very year!" :
                        age > 0 ? String.format("You are %d year%s old.", age, age == 1 ? "" : "s") :
                                String.format("You will be born in %d year%s.", -age, -age == 1 ? "" : "s");
    }
}