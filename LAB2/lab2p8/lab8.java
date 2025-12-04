package LAB2.lab2p8;

import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        String mode = input.next();
        double temp = input.nextDouble();
       
        if(mode.equals("C_TO_F")){  //ถ้าmode เท่ากับ C_TO_F เรียกใช้เมธอด celsiustoFahrenheit
 
            System.out.println(TempConverter.celsiustoFahrenheit(temp));
            
        }
        else if(mode.equals("F_TO_C")){ //ถ้าmode เท่ากับ F_TO_C เรียกใช้เมธอด fahrenheitToCelsius

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
        
        return (celsius*9.0/5.0)+32; //แปลงเป็นcelsius

    }

    public static double fahrenheitToCelsius(double fahrenheit){
        
        return (fahrenheit-32)*5.0/9.0; //แปลงเป็นfahrenheit

    }
    
}


