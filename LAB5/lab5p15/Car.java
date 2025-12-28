package LAB5.lab5p15;

public class Car extends RentalVehicle{
    public Car(String model,double rentalRate){
        super(model, rentalRate);
    }

    @Override
    public double calculatefee(){
        return this.rentalRate+100;
    }
}

