package LAB3.lab3p1;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        try {   //ตรวจจับข้อผิดพลาด
            User N1 = new User(name); 
            System.out.println(N1.getUsername()); 
        } catch (IllegalArgumentException e) { //ถ้ามีข้อผิดพลาดให้ทำคำสั่งที่ตามมา
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }
}
