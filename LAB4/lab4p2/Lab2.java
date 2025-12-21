package LAB4.lab4p2;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mode = input.nextInt();

        if (mode == 1) { //เช็คโหมด
            
            input.nextLine();
            String name = input.nextLine();
            Product p1 = new Product(name); //สร้างออบเจ็กต์Product
            p1.displayinfo();  //แสดงข้อมูล
 
        }
        else if(mode == 2){

            input.nextLine();
            String name = input.nextLine();
            double price = input.nextDouble();
            Product p1 = new Product(name,price);
            p1.displayinfo();
            
        }
        input.close();        
    }
}
class Product{

    private String name;
    private double price;

    public Product(String name){

       this(name, 0.0);
    }

    public Product(String name,double price){
        
        this.name = name;
        this.price = price;

    }   

    public void displayinfo(){
        System.out.println("Product:"+name+"Price:"+price);
    }
}
