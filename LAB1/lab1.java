package LAB1;
import java.util.Scanner; 
public class lab1 {
    public static void main(String[] addNumbers) {
        Scanner input = new Scanner(System.in);  
        System.out.println("NUM1 ");
        int numBer1 = input.nextInt();   
        System.out.println("NUM2 ");
        int numBer2 = input.nextInt();   
        System.out.println("SUM ");
        System.out.printf("%d",numBer1+numBer2); 
        input.close(); 
    }
}