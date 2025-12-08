package LAB2.lab2p7;

import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        double balance = input.nextDouble();
        double amountOfmoney1 = input.nextDouble();
        double amountOfmoney2 = input.nextDouble();

        BankAccount account  = new BankAccount(name,balance);
        
        account.mithdraw(amountOfmoney1);
        account.mithdraw(amountOfmoney2);

        account.displayBalance();
    }
}



class BankAccount{

    private String ownerName;
    private double balance;

    public BankAccount(String name ,double balance){

        this.ownerName = name;
        this.balance = balance;

    }

    public void mithdraw(double amount){

        if(amount <= 0){
            System.out.println("Error: Withdraw amount must be positive.");
        }  
        else if (amount > this.balance) {
            System.out.println("Error: Insufficient funds.");
        } 
        else {
            System.out.println("Status: Withdrawal successful.");
            this.balance -= amount; 
        }

        
    }

    public void displayBalance(){

        System.out.println("Balance: "+ this.balance);
    }
}
