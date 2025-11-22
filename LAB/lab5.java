package LAB;
import java.util.Scanner; // import Scanner
public class lab5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // เรียกใช้Scanner
        System.out.print("Menu Number"); // แสดงmenu number
        int numBer = input.nextInt(); // รับค่าตัวเลข
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
        input.close();  // ปิดScanner
    }
}