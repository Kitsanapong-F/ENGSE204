package LAB1;
import java.util.Scanner; 
public class lab2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double result = area(input);  //รับinput
        
        System.out.println(result); // แสดงค่าของresult
        
        input.close();
    }
    public static double area(Scanner input){
        
        double width = input.nextDouble();
        double height = input.nextDouble();
        
        return width*height;
    }
}
