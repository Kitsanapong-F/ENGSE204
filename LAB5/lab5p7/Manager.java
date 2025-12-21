package LAB5.lab5p7;

public class Manager extends Employee{
    
    protected double fixedBonus;

    public Manager(String name ,double baseSalary , double fixedBonus){
        super(name, baseSalary);
        setFixedbonus(fixedBonus);
    }

    public void setFixedbonus(double fixedBonus){
        if(fixedBonus<0){
            fixedBonus=0;
        }
        this.fixedBonus=fixedBonus;
    }

    @Override 
    public double calculatePlay(){
        return this.baseSalary+this.fixedBonus;
    }
}
