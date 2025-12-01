package LAB2.lab2p6;

import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ownerName = input.nextLine();
        double balance = input.nextDouble();
        double money = input.nextDouble();
        BankAccount a1 = new BankAccount(ownerName,balance);
        a1.deposit(money);
        a1.displaySummary();
        input.close();
    }
}
class BankAccount {
    private String ownerName;
    private double balance;
    
    public BankAccount(String ownerName,double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance= balance+amount;
    }

    public void displaySummary() {
        System.out.println(""+ownerName);
        System.out.printf("%.1f",balance);
    }
}

