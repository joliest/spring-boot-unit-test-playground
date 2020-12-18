package guru.springframework;

public class Dollar {

    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(multiplier * amount);
    }

    @Override
    public boolean equals(Object o) {
        Dollar dollar = (Dollar) o;
        return dollar.amount == amount;
    }
}
