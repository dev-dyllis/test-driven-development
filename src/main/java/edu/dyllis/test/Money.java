package edu.dyllis.test;

class Money implements Expression {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    String currency() {
        return this.currency;
    }

    Money times(int multiplier) {
        return new Money(this.amount * multiplier, currency);
    }

    Expression plus(Money addend) {
        return new Sum(this, addend);
    }

    public Money reduce(String to) {
        return this;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;

        return this.amount == money.amount
                && this.currency().equals(money.currency());
    }

    public String toString() {
        return amount + " " + currency;
    }
}
