package LAB5.lab5p15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String modelCar = input.nextLine();
        double rentalRateCar = input.nextDouble();
        input.nextLine();
        String modelMotorcycle = input.nextLine();
        double rentalRateMotorcycle = input.nextDouble();

        Car c1 = new Car(modelCar, rentalRateCar);
        Motorcycle m1 = new Motorcycle(modelMotorcycle, rentalRateMotorcycle);

        RentalVehicle[] r1 = {c1,m1};

        double totalRentalfee = 0;

        for(int i = 0;i<r1.length;i++){
            totalRentalfee+=r1[i].calculatefee();
        }

        System.out.println(totalRentalfee);

        input.close();
    }
}
