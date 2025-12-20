package LAB5.lab5p4;

public class Car extends Vehicle{
    
    protected int wheels;

    public Car(String color, int wheels){
        
        super(color);
        setWheels(wheels);

    }

    public void setWheels(int wheels){
        if(wheels<0){
            System.out.println("The number of wheels must not be negative.");
            wheels = 0;
        }
        this.wheels=wheels;
    }
    public void displayDetails(){
        System.out.println("Color: "+color+" Wheels: "+wheels);
    }
}
