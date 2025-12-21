package LAB4.lab4p5;

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int R = input.nextInt();  
        int G = input.nextInt();
        int B = input.nextInt();

        Color c1 = new Color(R, G, B);  //สร้างออบเจ็กcolor

        c1.displayinfo(); //แสดงข้อมูล

        input.close();
    }
}
class Color{

    private int red;
    private int green;
    private int blue;

    public Color(int r ,int g,int b){

        if(r<0){
            this.red = 0;
        }
        else if(r>255){
            this.red = 255;
        }
        else{ 
           this.red=r;
        }

        if(g<0){
            this.green = 0;
        }
        else if(g>255){
            this.green=255;
        }
        else{
            this.green=g;
        }
        
        if(b<0){
           this.blue=0;
        }
        else if(b>255){
            this.blue=255;
        }
        else{
            this.blue=b;
        }
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
