import java.util.Scanner;//import Scanner

public class lab3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);// สร้างScanner
        int number = input.nextInt();//รับค่า number
        String num = add(number);
        System.out.println(num);//แสดง num
        input.close();// ปิดScanner
    }
    public static String add(int a) {
        String A; //กำหนดค่า A
        if(a % 2 == 0){
            A = "Even";//กำหนดค่า A
        } else {
            A = "Odd";//กำหนดค่า A
        }
        return A;
    }
}
