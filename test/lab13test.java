package test;
import java.util.Scanner;
public class lab13test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt(); 
        int cols = input.nextInt(); 
        int[][] arr = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        input.close();
    }
}

