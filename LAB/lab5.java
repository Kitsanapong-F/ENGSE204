package LAB;
import java.util.Scanner; 
public class lab5 {
    public static void main(String[] menu){
        Scanner input = new Scanner(System.in); 
        System.out.print("Menu Number"); 
        int numBer = input.nextInt(); 
        if(numBer==1){
            System.out.println("Americano"); 
        }
        else if(numBer==2){
            System.out.println("Latte");
        }
        else if(numBer==3){
            System.out.println("Espresso");
        }
        else if(numBer==4){
            System.out.println("Mocha");
        }
        else{
            System.out.println("Invalid Menu");
        }
        input.close();  
    }
}