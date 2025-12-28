package LAB5.lab5p14;

public class Premiumshipping extends shipping{
    protected double insuranceFee;
    public Premiumshipping(String tracking , double baseFee,double insuranceFee){
        super(tracking, baseFee);
        this.insuranceFee=insuranceFee;
    }

    @Override
    public double calculateTotolfee(){
        super.calculateTotolfee();
        return baseFee+this.insuranceFee;
    }
}
