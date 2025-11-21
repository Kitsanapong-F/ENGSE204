package LAB;
import java.util.Scanner; //Import
public class lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //สร้าง Scanner
        System.out.print("NUM1 ");
        int numBer1 = input.nextInt();   //รับข้อมูล (numBer1)
        System.out.print("NUM2 ");
        int numBer2 = input.nextInt();   //รับข้อมูล (numBer2)
        System.out.print("SUM ");
        System.out.println(numBer1+numBer2); //แสดงผล
        input.close(); //ปิดScanner
    }
}