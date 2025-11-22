package LAB;
import java.util.Scanner; 
public class lab6 {
    public static void main(String[] multiply){
        Scanner input = new Scanner(System.in); 
        int numBer = input.nextInt(); 
        for(int i = 1 ;i<=12;i++){
            System.out.printf("%d x %d = %d\n",numBer,i,(numBer*i)); 
        }
        input.close(); 
    }
}

