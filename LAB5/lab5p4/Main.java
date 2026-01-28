package LAB5.lab5p4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try{
            String color = input.next();
            int wheels = input.nextInt();
            
            Car car = new Car(color, wheels);

            car.displayDetails();
        }
        catch(IllegalArgumentException e){
            System.out.println("Erorr :"+e.getMessage());
        }

        input.close();
    }
}
