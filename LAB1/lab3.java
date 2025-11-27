package LAB1;
import java.util.Scanner; 
public class lab3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);  
        int numBer = input.nextInt(); 
        if(numBer%2==0){
            System.out.println("Even"); 
        }
        else{
            System.out.println("Odd"); 
        }
        input.close(); 
    }
   
}
