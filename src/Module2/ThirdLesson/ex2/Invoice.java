package Module2.ThirdLesson.ex2;

public class Invoice {
    private int id;
    private CustomerFirst customerFirst;
    private double amount;

    public Invoice(int id, CustomerFirst customer, double amount) {
        this.id = id;
        this.customerFirst = customer;
        this.amount = amount;
    }


    public int getId() {
        return id;
    }

    public CustomerFirst getCustomer() {
        return customerFirst;
    }

    public void setCustomer(CustomerFirst customerFirst) {
        this.customerFirst = customerFirst;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return this.customerFirst.getId();
    }

    public String getCustomerName() {
        return this.customerFirst.getName();
    }

    public int getCustomerDiscount() {
        return this.customerFirst.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return this.amount - (this.amount * this.customerFirst.getDiscount()) / 100;
    }

    @Override
    public String toString() {
        return "Invoice[" +
                "id=" + id +
                ", customer=" + customerFirst +
                ", amount=" + amount +
                ']';
    }
}
