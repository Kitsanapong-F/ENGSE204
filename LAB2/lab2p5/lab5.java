package LAB2.lab2p5;
import java.util.Scanner;
public class lab5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width = input.nextDouble();
        double height = input.nextDouble();
        Rectangle A = new Rectangle(width,height);
        System.out.println(A.getArea());
        System.out.println(A.getPerimeter());
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
        return width*height;
    }
    public double getPerimeter(){
        return (width+height)*2;
    }
}   

