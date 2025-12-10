
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Starting score");
        int score = input.nextInt();

        System.out.println("Score update");
        int newScore = input.nextInt();

        try{    //ตรวจจับข้อผิดพลาด
            Player p1 = new Player(score);

            p1.setScore(newScore);
            
            System.out.println("Latest score");
            System.out.println(p1.getScore());

        }
        catch(IllegalArgumentException e){ //ถ้ามีข้อผิดผลาดให้ทำคำสั่ง
            System.out.println("Error: " + e.getMessage()); 
        }
        
        input.close();
    }
}

