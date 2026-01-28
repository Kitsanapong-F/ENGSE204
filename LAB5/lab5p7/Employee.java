package LAB5.lab5p7;
//superclass
public class Employee {
    
    protected String name;
    protected double baseSalary;

    public Employee(String name,double baseSalary){
        
        setBasesalary(baseSalary);
        setName(name);

    }

    public void setName(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("name cannot be null or empty");
        }
        this.name=name;
    }

    public void setBasesalary(double baseSalary){
        if(baseSalary<0){
            baseSalary=0;
        }
        this.baseSalary=baseSalary;
    }

    public double calculatePlay(){
        return this.baseSalary;
    }
}

