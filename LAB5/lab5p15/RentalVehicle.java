package LAB5.lab5p15;

public class RentalVehicle {
    
    protected String model;
    protected double rentalRate;

    public RentalVehicle(String model,double rentalRate){
        this.model=model;
        this.rentalRate=rentalRate;
    }

    public double calculatefee(){
        return this.rentalRate;
    }
}
