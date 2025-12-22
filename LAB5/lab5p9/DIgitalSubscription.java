package LAB5.lab5p9;

public class DIgitalSubscription extends Item{
    
    protected double monthlyCost;
    protected int months;

    public DIgitalSubscription(String name,double monthlyCost,int months){
        super(name);
        setMonthlycost(monthlyCost);
        setMonths(months);
    }

    public void setMonthlycost(double monthlyCost){
        if(monthlyCost<0){
            monthlyCost=0;
        }
        this.monthlyCost=monthlyCost;
    }

    public void setMonths(int months){
        if(months<0){
          months=0;  
        }
        this.months=months;
    }
    @Override
    public double getValue(){
        return monthlyCost*months;
    }

}
