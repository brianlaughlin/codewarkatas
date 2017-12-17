package kata.playground.inheritthis;

public abstract class SharedAttributes implements Person{
    public String toPrettyString() {
        return whoAmI() + " " + drives();
    }
}
