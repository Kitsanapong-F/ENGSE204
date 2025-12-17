package LAB4.lab4p9;

import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String ID = input.nextLine();
        double startinBalance =input.nextDouble();
        double deposit = input.nextDouble();
        double withdraw = input.nextDouble();

        immutableAccount acc1 =new immutableAccount(ID, startinBalance);
        immutableAccount acc2 = acc1.deposit(deposit);
        immutableAccount acc3 = acc2.withdraw(withdraw);
        acc1.displayInfo();
        acc3.displayInfo();
    }
}

class immutableAccount{

    private final String accountld;
    private final double balance;

    public immutableAccount(String accountld,double balance){
        
        if (balance < 0) {
            this.balance = 0.0;
        }   
        else {
            this.balance = balance;
        }
        this.accountld = accountld;
    

    }

    public immutableAccount(immutableAccount other){
        
        this.accountld = other.accountld;
        this.balance = other.balance;

    }

    public String getAccountld() {
        return accountld;
    }

    public double getBalance(){
        return balance;
    }

   public immutableAccount deposit(double amount) {
    if (amount > 0) {
        return new immutableAccount(this.accountld, this.balance + amount);
    }
    System.out.println("Invalid deposit amount.");
    return this;
    }
    
     public immutableAccount withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return this;
        } 
        else if (amount > balance) {
            System.out.println("Insufficient funds.");
            return this;
        } 
        else {
            return new immutableAccount(this.accountld, this.balance - amount);
        }
    }

    public void displayInfo() {
        System.out.println("ID: " +  accountld + ", Balance: " + balance);
    }
    
}
