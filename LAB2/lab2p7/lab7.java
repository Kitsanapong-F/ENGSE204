package LAB2.lab2p7;
import java.util.Scanner;
public class Lab7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        String name = input.nextLine();
        double balance = input.nextDouble();
        double monney1 = input.nextDouble();
        double monney2 = input.nextDouble();

        Account a = new Account(name, balance); //  สร้างออบเจ็กต์Account

        a.withdraw(monney1); // เรียกใช้เมธอด withdraw
        a.withdraw(monney2);  // เรียกใช้เมธอด withdraw
        a.displayBalance();  // เรียกใช้เมธอด displayBalance

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
            initialBalance = initialBalance-amount;
        }
        else if(amount>=initialBalance){
            System.out.println("Insufficient funds.");
        }

    }

    public void displayBalance(){

        System.out.printf("Balance:%.1f",initialBalance);
        
    }
}