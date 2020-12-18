package guru.springframework;

public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(multiplier * amount);
    }
}
