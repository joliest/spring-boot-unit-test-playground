package guru.springframework;

public abstract  class Money {
    protected int amount;

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount);
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return money.amount == amount && getClass().equals(o.getClass());
    }

    public abstract Money times(int multiplier);
}
