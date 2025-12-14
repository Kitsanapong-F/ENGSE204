package LAB3.lab3p14;

import java.util.Scanner;

public class Lab14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BankAccount myAccount = null;

        int N = input.nextInt();

        for(int i = 0;i < N;i++){

            String mode = input.next();

            if(mode.equals("CREATE")){

                double initialDeposit = input.nextDouble();

                myAccount = new BankAccount(initialDeposit);
            }
            else if(mode.equals("DEPOSIT")|| mode.equals("WITHDRAW")){
                
                double amount = input.nextDouble();

                if(myAccount == null){
                    System.out.println("No account exists.");
                }
                else if(myAccount !=null){
                    if(mode.equals("DEPOSIT")){
                        myAccount.deposit(amount);
                    }
                    else if(mode.equals("WITHDRAW")){
                        myAccount.withdraw(amount);
                    }
                }
            }
            else if(mode.equals("STATUS")){
                if(myAccount != null){
                    System.out.println("Balance: "+myAccount.getBalance());
                }
                else if(myAccount == null){
                    System.out.println("No account exists.");
                }
            }
            else if(mode.equals("GLOBAL_STATUS")){
                System.out.println("Total Transactions: "+BankAccount.getTotaltransactionCount());
            }
        }
        input.close();
    }    
}

class BankAccount{

    private double balance;
    private static int totaltransactionCount = 0;
    
    public BankAccount(double initialDeposit){ //เช็คเงินมีมากกว่า0

        if(initialDeposit>=0){
            
            this.balance = initialDeposit;
            
        }
        else if(initialDeposit<0){
            balance = 0;
        }

        System.out.println("Account created");

    }

    public void deposit(double amount){ //เช็คเงินติดลบ

        if(amount>0){
            
            balance+=amount;
            totaltransactionCount++;

            System.out.println("Deposit successful.");
        }
        else if(amount<0){
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount){

        if(amount>0 && amount<=balance){ //เช็คค่าจำนวนเงิน
            
            balance -= amount;
            totaltransactionCount++;

            System.out.println("Withdrawal ssuccessful.");
        }
        else if(amount>balance){
            System.out.println("Insufficent funds.");
        }
        else if(amount<0){
            System.out.println("Incalid amount.");
        }
    }

    public double getBalance(){
        return balance;
    }

    public static int getTotaltransactionCount(){
        return totaltransactionCount;
    }
    
}