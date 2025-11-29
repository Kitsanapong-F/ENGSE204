package LAB2;
import java.util.Scanner;
public class lab8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mode = input.nextLine();
        double temp = input.nextDouble();
        if(mode.equals("C_TO_F")){
            System.out.println(TempConverter.celsiustoFahrenheit(temp));
        }
        else if(mode.equals("F_TO_C")){
            System.out.println(TempConverter.fahrenheitToCelsius(temp));
        }
        else{
            System.out.println("no mode");
        }
        input.close();
    }   
}


class TempConverter{

    public static double celsiustoFahrenheit(double celsius){
        return (celsius*9.0/5.0)+32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit-32)*5.0/9.0;
    }
    
}


