package LAB;
import java.util.Scanner;
public class lab11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] scores = new int[N];
        int sum = sumArray(scores);
        System.out.printf("%d",sum);
        input.close();
    }
    public static int sumArray(int[] numBer){
        Scanner input = new Scanner(System.in);
        int sum=0;
        for(int i = 0;i<numBer.length;i++){
        numBer[i] = input.nextInt();
        sum = sum + numBer[i];
        }
        input.close();
        return sum;
    }
    
}
