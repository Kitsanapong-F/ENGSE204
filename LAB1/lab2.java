package LAB1;
import java.util.Scanner; 
public class lab2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double result = area(input);
        System.out.println(result);
        input.close();
    }
    public static double area(Scanner input){
        double area = 0;
        double width = input.nextDouble();
        double height = input.nextDouble();
        area= width*height;
        return area;
    }
}
