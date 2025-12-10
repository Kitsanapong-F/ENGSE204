package LAB3.lab3p6;

import java.util.Scanner;

public class Lab6 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double startingBalance = input.nextDouble();
    double deposit = input.nextDouble();
    double withDrawal = input.nextDouble();

    BankAccount b1 = new BankAccount(startingBalance);
    
    b1.deposit(deposit);
    b1.withdraw(withDrawal);

    System.out.println("Final Balance:"+b1.getBalance());

    input.close();
}
     
}

class BankAccount{

    private  double balance;
 
    public BankAccount(Double initiaBalance){

        if(initiaBalance >= 0){
            
            this.balance = initiaBalance;

        }
        else if(initiaBalance < 0){
            
            this.balance = 0;

        }   

    }

    public double getBalance(){
        return balance;
    }

    protected void deposit(double amount){

        if(amount > 0){
            
            balance += amount;

            System.out.println("Deposit successful.");

        }
        else if(amount <= 0){
            
            System.out.println("Invalid deposit amount.");

        }
    }

    public void withdraw(double amount){

        if(amount > 0 || amount <= balance ){
            
            balance -= amount;
            
            System.out.println("Withdrawal successful");

        }
        else if(amount > balance){

            System.out.println("Insufficient funds");

        }
        else if(amount<=0){

            System.out.println("Invalid withdrawal amount");

        }
    }
}