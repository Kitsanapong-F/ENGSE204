package LAB1;
import java.util.Scanner; 
public class lab6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        
        int numBer = input.nextInt(); 
        
        for(int i = 1 ;i<=12;i++){ // ลูป 12 ครั้ง
            
            System.out.printf("%d x %d = %d\n",numBer,i,(numBer*i)); // แสดงการคูณ 

        }

        input.close(); 
    }
}

