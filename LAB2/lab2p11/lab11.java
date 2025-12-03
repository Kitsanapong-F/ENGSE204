package LAB2.Lab2p11;
import java.util.Scanner;
public class Lab11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String model = input.nextLine();
        int year = input.nextInt();
        int newYear = input.nextInt();
        Car c1 = new Car(model,year);
        c1.setYear(newYear);
        System.out.println("Model:"+c1.getModel());
        System.out.println("Year:"+c1.getYear());
        input.close();
    }    
}

class Car{
    
    private String model;
    private int year;

    public Car(String model , int year){
        this.model = model;
        this.year = year;    
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int newYear){
        year = newYear;
    }
}


