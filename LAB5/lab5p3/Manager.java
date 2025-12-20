package LAB5.lab5p3;

public class Manager  extends Employee{
    
    public Manager(double salary){
        super(salary);
    }

    @Override
    public double calculateBonus(){
        return super.calculateBonus()+(salary*0.05);
    }
}
