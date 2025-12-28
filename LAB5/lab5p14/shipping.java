package LAB5.lab5p14;

public class shipping {
    
    protected String tracking;
    protected double baseFee;

    public shipping(String tracking , double baseFee){
        this.tracking = tracking;
        this.baseFee=baseFee;
    }

    public double calculateTotolfee(){
        return this.baseFee;
    }
}
