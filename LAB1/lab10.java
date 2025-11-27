package LAB1;
import java.util.Scanner;
public class lab10 {
    public static void main(String[] Area) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double area = calculateArea(a, b);
        System.out.println(area);
        input.close();
    }
    public static double calculateArea(double width,double height){
        double area = width*height;
        return area; 
    }
}
