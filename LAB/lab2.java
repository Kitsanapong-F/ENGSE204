package LAB;
import java.util.Scanner; 
public class lab2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double result = area(input);
        System.out.printf("%.2f",result);
        input.close();
    }
    public static double area(Scanner input){
        double sum = 0;
        double width = input.nextInt();
        double height = input.nextInt();
        sum= width*height;
        return sum;
    }
}
