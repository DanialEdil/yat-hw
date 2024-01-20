package Module2.ThirdLesson.ex4;

public class Account {
    private int id;
    private CustomerSecond customer;

    private double balance = 0.0;

    public Account(int id, CustomerSecond customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, CustomerSecond customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public CustomerSecond getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return customer + " balance=$" + balance;
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}
