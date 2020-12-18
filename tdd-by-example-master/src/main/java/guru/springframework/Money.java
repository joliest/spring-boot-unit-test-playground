package guru.springframework;

public abstract  class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return money.amount == amount && getClass().equals(o.getClass());
    }

    public abstract Money times(int multiplier);

    protected String currency() {
        return currency;
    }
}
