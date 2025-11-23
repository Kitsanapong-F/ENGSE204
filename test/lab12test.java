package test;

import java.util.Scanner;
public class lab12test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numBer = input.nextInt();
        int[][] x = readArRay(input, numBer);
        

        input.close();
    }
    public static int[][] readArRay(Scanner input,int a ){
        int[] proDuctID = new int[a];
        int[] stockQuantiTy = new int[a];
        for(int i = 0;i<proDuctID.length;i++){
            proDuctID[i] = input.nextInt();
            stockQuantiTy[i] = input.nextInt(); 
        }
        return new int[][]{proDuctID,stockQuantiTy};
    }
}
