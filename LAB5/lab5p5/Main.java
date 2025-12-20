package LAB5.lab5p5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        try{

            double radius = input.nextDouble();
            double witdth = input.nextDouble();
            double height = input.nextDouble();

            Circle c1 = new Circle("Circle", radius);
            Rectangle r1 = new Rectangle("Rectangle", witdth, height);

            Shape[] s1 = {c1 , r1};

            for(int i = 0; i<s1.length;i++){
                System.out.println("Name: "+s1[i].name);
                System.out.println(s1[i].calculateArea());
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Erorr: "+e.getMessage());
        }
    }
}
