import java.util.Scanner; //import Scanner

public class lab3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);  // สร้างScanner
        int numBer = input.nextInt();  //รับค่า number
        if(numBer%2==0){
            System.out.println("Even"); //แสดงEven
        }
        else{
            System.out.println("Odd"); //แสดง Odd
        }
        input.close(); // ปิดScanner
    }
   
}
