package LAB;
import java.util.Scanner; // importScanner
public class lab2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//สร้างscanner
        double width = input.nextDouble();//รับค่า width
        double height = input.nextDouble();//รับค่า height
        System.out.println(width*height); // แสดงผล width*height
        input.close();//ปิดScanner
    }
}
