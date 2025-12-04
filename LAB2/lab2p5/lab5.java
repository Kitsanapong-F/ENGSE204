package LAB2.lab2p5;
import java.util.Scanner;
public class Lab5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double width = input.nextDouble();
        double height = input.nextDouble();
        
        Rectangle A = new Rectangle(width,height); //สร้างอบบเจ็กต์  Rectangle
        
        System.out.println(A.getArea()); //แสดงค่าเมธอดgetArea
        System.out.println(A.getPerimeter()); //แสดงค่าเมธอดgetPerimeter
        
        input.close();
    }    
}

class Rectangle{
   
    private double width;
    private double height;

    public Rectangle(double width, double height){
        
        this.width=width;
        this.height=height;

    }
    public double getArea(){
        return width*height;  //ส่งค่าwidth*height
    }
    public double getPerimeter(){
        return (width+height)*2; 
    }
}   

