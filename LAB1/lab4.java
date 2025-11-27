package LAB1;
import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numBer = input.nextInt();
        if (numBer >= 80 && numBer <= 100) {
            System.out.println("A");
        } else if (numBer >= 70 && numBer <= 79) {
            System.out.println("B");
        } else if (numBer >= 60 && numBer <= 69) {
            System.out.println("C");
        } else if (numBer >= 50 && numBer <= 59) {
            System.out.println("D");
        } else if (numBer >= 0 && numBer <= 49) {
            System.out.println("F");
        } else {
            System.out.println("enternumber");
        }
        input.close();
    }
}
