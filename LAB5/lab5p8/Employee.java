package LAB5.lab5p8;
//superclass
public class Employee extends Person {
    
    protected double salary;

    public Employee(String name , double salary){
        super(name);
        this.salary = salary;
    }

    public void applyBonus(double bonus){
        if(bonus<0){
            bonus = 0;
        }
        this.salary+=bonus;
    }

    @Override
    public String getStatus(){
        return ("Employee: "+this.name+" Salary: "+this.salary);
    }
}
