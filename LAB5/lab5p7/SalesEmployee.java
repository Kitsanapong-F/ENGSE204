package LAB5.lab5p7;
//supclass
public class SalesEmployee  extends Employee{
    
    protected double commissionRatr;
  

    public SalesEmployee(String name,double baseSalary,double commissionRatr){
        
        super(name, baseSalary);
        setCommissionrate(commissionRatr);
    }

    public void setCommissionrate(double commissionRatr){
        if(commissionRatr<0){
            commissionRatr=0;
        }
        this.commissionRatr=commissionRatr;
    }

    @Override
    public double calculatePlay(){
        return this.baseSalary+(this.baseSalary*this.commissionRatr);
    }
}
