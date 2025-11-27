package LAB1;
import java.util.Scanner;
public class lab9 {
    public static void main(String[] AverAge) {
        Scanner input = new Scanner(System.in);
        int[] x = read(input);
        double area = calculate(x);
        System.out.printf("%.2f",area);
        input.close();
      
    }
    public static int[] read(Scanner input){
        int numBer = input.nextInt();
        int num[] = new int[numBer];
        for(int i = 0;i<num.length;i++){
            num[i] = input.nextInt();
        }
        return num;
    }
    public static double calculate(int[] math){
        double sum=0;
        for(int j = 0;j<math.length;j++){
            sum = sum+math[j];
        }
        return sum/math.length;
    }
}
