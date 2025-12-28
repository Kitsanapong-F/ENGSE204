package LAB5.lab5p14;

public class Standardshipping extends shipping{
    public Standardshipping(String tracking , double baseFee){
        super(tracking, baseFee);
    }

    @Override
    public double calculateTotolfee(){
        return this.baseFee*1.05;
    }
}
