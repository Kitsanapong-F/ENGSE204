package LAB1;
import java.util.Scanner;;
public class lab13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int R = input.nextInt();
        int C = input.nextInt();
        int[][]  arRay2D = new int[R][C];
        for(int i = 0;i<R;i++){
            for(int j = 0;j<C;j++){
                arRay2D[i][j] = input.nextInt();
            }
        }
        int onLine=0;
         for(int i = 0;i<R;i++){
            for(int j = 0;j<C;j++){
                if(arRay2D[i][j]==1){
                    onLine=onLine+1;
                }
            }
        }
        System.out.printf("%d",onLine);
        
        input.close();
    }
}
