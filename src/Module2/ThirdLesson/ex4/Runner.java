package Module2.ThirdLesson.ex4;

import Module2.ThirdLesson.ex3.Account;
import Module2.ThirdLesson.ex3.Customer;

public class Runner {

    public static void main(String[] args) {
        // Test Customer class
        Customer c1 = new Customer(88, "Tan Ah Teck", 'f');
        System.out.println(c1);  // Customer's toString()

        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());

        // Test Invoice class
        Module2.ThirdLesson.ex3.Account account = new Account(101, c1, 888.8);
        System.out.println(account);

        account.setBalance(999.9);
        System.out.println(account);
        System.out.println("id is: " + account.getId());
        System.out.println("customer is: " + account.getCustomer());  // Customer's toString()
        System.out.println("balance is: " + account.getBalance());
        System.out.println("customer's name is: " + account.getCustomerName());


        System.out.println("customer's deposit is: " + account.deposit(122));
        System.out.println("customer's withdraw is: " + account.withdraw(15));

    }
}