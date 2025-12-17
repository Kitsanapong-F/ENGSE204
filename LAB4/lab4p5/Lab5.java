package LAB4.lab4p5;

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int R = input.nextInt();
        int G = input.nextInt();
        int B = input.nextInt();

        Color c1 = new Color(R, G, B);

        c1.displayinfo();
    }
}
class Color{

    private int red;
    private int green;
    private int blue;

    public Color(int r ,int g,int b){

        if(r<0){
            r = 0;
        }
        else if(r>255){
            r=255;
        }
         if(g<0){
            g = 0;
        }
        else if(g>255){
            g=255;
        }
         if(b<0){
            b= 0;
        }
        else if(b>255){
            b=255;
        }
        this.red=r;
        this.green=g;
        this.blue=b;
    }
    
    public int getred(){
        return red;
    }
    
    public int getgreen(){
        return green;
    }
    
    public int getblue(){
        return blue;
    }

    public void displayinfo(){
        System.out.println("R"+red+"G"+green+"B"+blue);
    }
}
