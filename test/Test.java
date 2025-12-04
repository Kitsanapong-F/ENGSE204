package test;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        double initialBalance = input.nextDouble();
        double withdrawAmount1 = input.nextDouble();
        double withdrawAmount2 = input.nextDouble();

        Account account = new Account(name, initialBalance);    // สร้างออบเจ็กต์ Account
 
        account.withdraw(withdrawAmount1);    
        account.withdraw(withdrawAmount2);
        account.displayBalance();

        input.close();
    }
}

class Account {

    private String ownerName;
    private double balance;

    public Account(String name, double balance) {
        this.ownerName = name;
        this.balance = balance;
    }

 
    public void withdraw(double amount) {
     
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount."); // ป้องกันจำนวนติดลบ
        } else {
            System.out.println("Insufficient funds.");
        }
    }


    public void displayBalance() {
        System.out.printf("Balance: %.1f%n", balance);
    }
}
