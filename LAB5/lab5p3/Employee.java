package LAB5.lab5p3;
//superclass
public class Employee {
    
    protected double salary;

    public Employee(double salary){
        System.out.println("[Employee Constructor] is running...");
        setSalaly(salary);

    }

    public void setSalaly(double salary){
        if(salary<0){
            System.out.println("Salaly must not be negative.");
            salary = 0;
        }
        this.salary = salary;
    }

    public double calculateBonus(){
        return salary*0.10;
    }
}
