package LAB3.lab3p2;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score = input.nextInt();
        int newscore = input.nextInt();

        try{
            Player p1 = new Player(score);
            p1.setScore(newscore);
            p1.getScore();
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        input.close();
    }
}
