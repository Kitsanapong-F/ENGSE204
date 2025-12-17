package LAB4.lab4p6;

import java.util.Scanner;

public class Lab6 {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int x = input.nextInt();
    int y = input.nextInt();
    int dx = input.nextInt();
    int dy = input.nextInt();

    Point p1 = new Point(x, y);
    Point p2 = p1.move(dx, dy);
    Point p3 = p2.move(dx, dy);

    p1.displayinfo();
    p2.displayinfo();
    p3.displayinfo();

    input.close();
 }   
}
class Point{

    private final int x;
    private final int y;

    public Point(int x,int y){
        
        this.x=x;
        this.y=y;

    }

    public int getX(){
        return x;
    }    

    public int getY(){
        return y;
    }

    public Point move(int dx , int dy){
       
        int newX=this.x+dx;
        int newY=this.y+dy;

        return new Point(newX, newY);
    }  

    public void displayinfo(){
        System.out.println("("+x+","+y+")");
    }
        
}
