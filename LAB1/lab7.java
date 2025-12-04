package LAB1;
import java.util.Scanner;
public class lab7 {
    public static void main(String[] math){
        Scanner input = new Scanner(System.in);
        
        int sum=0;
        int num1 = input.nextInt();
      
        for(int i=1;i<=num1;i++){   // ลูปตามจำนวน num1
            
            int num2 = input.nextInt(); 
            sum += num2;  // นับผลรวม

        }
       
        System.out.println(sum);

        input.close();
    }
}
