package LAB3.lab3p4;

import java.util.Scanner;

public class LAB4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        input.nextLine();

        try{  //ตรวจจับข้อผิดพลาด
            for(int i = 0 ; i<num ; i++){ // ลูปรับค่า name
           
            String name = input.nextLine();

            new Product(name);       //สร้างออบเจ็ก 

            }

            System.out.println(Product.getProductCount());

        }
        catch(IllegalArgumentException e){ //ถ้ามีข้อผิดพลาดให้ทำคำสั่ง
            
            System.out.println("Error: " + e.getMessage());

        }
        
        input.close();

    }
}
class Product{

    private String name;
    private static int productCoint = 0;

    public Product(String name){
        
        setname(name);
        productCoint++;

    }

    public String getName(){
        return name;
    }

    public static int getProductCount(){
        return productCoint;
    }

    public void setname(String name){
        if(name == null || name.isEmpty()){ //ถ้าค่าที่รับมาว่างให้โยน Error ออก

            throw new IllegalArgumentException("Prouct name cannot be null or empty");

        }
    } 
}
