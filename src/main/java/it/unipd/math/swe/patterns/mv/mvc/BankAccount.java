package it.unipd.math.swe.patterns.mv.mvc;

/**
 * A Bank account that allows to withdraw and deposit a quantity. In our example, it represents the Model component
 * inside the MVC pattern. It implements the <em>business logic</em>.
 */
public class BankAccount extends Subject {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double withdraw(double quantity) {
        if (quantity >= amount) {
            throw new IllegalArgumentException("Quantity must be less than the available amount");
        }
        amount -= quantity;
        notifyObservers();
        return amount;
    }

    public void deposit(double quantity) {
        amount += quantity;
        notifyObservers();
    }

    public double getAmount() {
        return amount;
    }
}
