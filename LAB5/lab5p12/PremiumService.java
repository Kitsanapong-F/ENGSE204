package LAB5.lab5p12;

public class PremiumService extends Service{
    
    protected double premiumRate;

    public PremiumService(String name , double basePrice , double premiumRate){
        super(name, basePrice);
        setPremiunRate(premiumRate);
    }

    public void setPremiunRate(double premiumRate){
        if(premiumRate < 0){
            premiumRate = 0;
        }
        this.premiumRate=premiumRate;
    }

    public double calculateFinalprice(){
        return this.basePrice*(1+this.premiumRate);
    }
}
