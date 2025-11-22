package LAB;
import java.util.Scanner;
public class lab11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numBer = input.nextInt();
        int[] read = readarr(input, numBer);
        int cal = calCulate(read);
        System.out.printf("%d",cal);
        input.close();
    }
    public static int[] readarr(Scanner input,int num){
        int arrNum[] = new int[num];
        for(int i = 0;i<arrNum.length;i++){
            arrNum[i] = input.nextInt();
        }
        return arrNum;
    }
    public static int calCulate(int[] arr){
        int sum = 0;
        for(int j = 0;j<arr.length;j++){
            sum = sum +arr[j];
        }
        return sum;
    }
}
