package LAB2.lab2p7;
import java.util.Scanner;
public class lab7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double balance = input.nextDouble();
        double amount1 = input.nextDouble();
        double amount2 = input.nextDouble();
        Account a = new Account(name, balance);
        a.withdraw(amount1);
        a.withdraw(amount2);
        a.displayBalance();
        input.close();
    }
}

class Account{
    private String ownerName;
    private double initialBalance;

    public Account(String name,double balance) {

        this.ownerName = name;
        this.initialBalance=balance;
    }

    public void withdraw(double amount){
        if(amount<=initialBalance){
            System.out.println("Withdrawal successful.");
            initialBalance= initialBalance-amount;
        }
        else{
            System.out.println("Insufficient funds.");
        }
    }

    public void displayBalance(){
        System.out.printf("Balance:%.1f",initialBalance);
    }
}