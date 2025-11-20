import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int numBer1 = input.nextInt();
        int numBer2 = input.nextInt();
        System.out.println(numBer1+numBer2);
        
        input.close();
    }
}