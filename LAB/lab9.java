package LAB;
import java.util.Scanner;
public class lab9 {
    public static void main(String[] AverAge) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        double sum=0;
        int[] numBers = new int[x];
        for(int i = 0;i<numBers.length;i++){
            numBers[i] = input.nextInt();
            sum = sum + numBers[i];
        }
        double averAge = (sum/x);
        System.out.print(averAge);
        input.close();
    }
}
