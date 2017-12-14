package kata.playground;

import java.util.Objects;

public class Dollar {
    private int amount;

    public Dollar(int i) {
        this.amount = i;
    }

    public Dollar times(int i) {
        return new Dollar(amount * i);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dollar dollar = (Dollar) o;
        return amount == dollar.amount;
    }

    @Override
    public int hashCode() {

        return Objects.hash(amount);
    }
}
