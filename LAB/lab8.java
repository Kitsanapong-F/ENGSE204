package LAB;
import java.util.Scanner;
public class lab8 {
    public static void main(String[] max) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int[] numbers = new int[x];
        int max = numbers[0];
        for(int i = 0;i<numbers.length;i++){
            numbers[i] = input.nextInt();
            if(numbers[i] > max) {
                max = numbers[i]; 
            }
        }
        System.out.println(max);
        input.close();
    }
}
