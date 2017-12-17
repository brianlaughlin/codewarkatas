package kata.playground.inheritthis;

public class Mother extends SharedAttributes implements Person {
    @Override
    public String whoAmI() {
        return "I am your Mother.";
    }

    @Override
    public String drives() {
        return "Drives a Volvo.";
    }

}
