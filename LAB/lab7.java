package LAB;
import java.util.Scanner;
public class lab7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int sum=0;
        for(int i=1;i<=num1;i++){
            int num2 = input.nextInt();
            sum+=num2;
        }
        System.out.println(sum);
        input.close();
    }
}
