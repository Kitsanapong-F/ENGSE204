package LAB4.lab4p3;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mode = input.nextInt();

        if(mode == 1){ //เช็คโหมด
            Player p1 = new Player();  //สร้างออบเจ็กต์
            p1.displayinfo();  //แสดงข้อมูล
        }
        else if(mode == 2){

            input.nextLine();
            String name = input.nextLine();
            int level = input.nextInt();
            Player p1 = new Player(name, level);
            p1.displayinfo();
        }

        input.close();

    }
}

class Player{

    private String username;
    private int level;

    public Player(){

        this.username = "Guest";
        this.level = 1;
    }

    public Player(String username,int level){

        this.username = username;
        this.level = level ;

    }

    public void displayinfo(){
        System.out.println("User:"+username+"Level:"+level);
    }
}
