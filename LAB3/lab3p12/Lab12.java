package LAB3.lab3p12;

import java.util.Scanner;

public class Lab12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        double monthlySalary = input.nextDouble();
        double taxRate = input.nextDouble();
        double raiseAmount = input.nextDouble();

        Employee e1 = new Employee(name, monthlySalary);
        
        System.out.println("Tax (Before): "+e1.calculateTax(taxRate));

        e1.giveRaise(raiseAmount);

        System.out.println("Tax (After): "+e1.calculateTax(taxRate));
    }
}

class Employee{

    private String name;
    private double monthlySalary;

    public Employee(String name,double monthlySalary){
        
        this.name = name;

        if(monthlySalary>0){
            this.monthlySalary=monthlySalary;
        }
        else if(monthlySalary<=0){
            this.monthlySalary = 0;
        }

    }

    public String getName(){
        return name;
    }

    public void giveRaise(double amount){
        if(amount>0){
            
            monthlySalary += amount;

            System.out.println("Raise applied.");
        }
        else if(amount<=0){
            System.out.println("Incalid amount");
        }
    }

    private double getAnnualSalary(){
        return monthlySalary*12;
    }

    public double calculateTax(double taxRate){
       return getAnnualSalary()*taxRate;
    }

}
