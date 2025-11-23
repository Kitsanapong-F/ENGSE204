package LAB;
import java.util.Scanner;
public class lab12 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numBer = input.nextInt();
    int[] proDuctid = new int[numBer];
    int[] stockQuantiTy = new int[numBer];
    for(int i = 0;i<proDuctid.length;i++){
        proDuctid[i] = input.nextInt();
        stockQuantiTy[i] = input.nextInt();
    }
    int check = input.nextInt();
    int anSwer=0;
    int j;
    for( j = 0;j<proDuctid.length;j++){
        if(check==proDuctid[j]){
           anSwer=1;
           break;
        }
    }
    if(anSwer==1){
        System.out.printf("%d",stockQuantiTy[j]);
    }
    else{
        System.out.printf("Product %d not found",check);
    }
    input.close();
    }
}
