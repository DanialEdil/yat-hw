package Module2;

public class InvestmentCalculator {
    private double initialAmount;
    private double annualInterestRate;
    private Wallet wallet;

    public InvestmentCalculator(double initialAmount, double annualInterestRate, Wallet wallet) {
        this.initialAmount = initialAmount;
        this.annualInterestRate = annualInterestRate;
        this.wallet = wallet;
    }

    public void calculateEarnings(int years) {
        int n = 1;
        double a = this.initialAmount * Math.pow((1 + ((annualInterestRate / 100) / n)), years * n);

        System.out.println("Текущая сумма вклада: " + a);
        System.out.println("Баланс кошелька: " + (a - this.initialAmount));
    }
}
