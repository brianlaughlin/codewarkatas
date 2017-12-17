package kata.playground.inheritthis;

public class Father extends SharedAttributes implements Person{
    @Override
    public String whoAmI() {
        return "I am your Father.";
    }

    @Override
    public String drives() {
        return "Driving a Tesla";
    }

}
