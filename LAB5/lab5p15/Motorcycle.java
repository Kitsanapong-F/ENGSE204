package LAB5.lab5p15;

public class Motorcycle extends RentalVehicle{
    public Motorcycle(String model,double rentalRate){
        super(model, rentalR
            ate);
    }

    @Override
    public double calculatefee(){
        return this.rentalRate*1.10;
    }
}
