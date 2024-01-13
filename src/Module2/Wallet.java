package Module2;

public class Wallet {
    private double balance;

    public Wallet(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance = amount;
    }

    public boolean withdraw(double amount) {
        if (amount < 0) {
            return false;
        }
        if (this.balance > amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public boolean transferTo(Wallet targetWallet, double amount) {
        if (targetWallet.getBalance() > amount) {
            balance = targetWallet.getBalance() - amount;
            return true;
        }

        return false;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
