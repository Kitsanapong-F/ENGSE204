package LAB3.lab3p8;

import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try{  //ตรวจจับข้อผิดพลาด
        String productName = input.next();
        int initialStock = input.nextInt();

        InventoryItem i1 = new InventoryItem(productName, initialStock);

        int num = input.nextInt();

        for(int i = 0 ; i<num ; i++){
            
            String order = input.next();
            int amount = input.nextInt();
            
            if(order.equals("ADD")){
                i1.addStock(amount);
            }
            else if(order.equals("SELL")){
                i1.sellStock(amount);
            }
        }

        System.out.println("Final Stock:"+i1.getStock());

        }
        catch(IllegalArgumentException e){ //ถ้ามีข้อผิดผลาดให้ทำคำสั่ง
            System.out.println("Error: "+e.getMessage());
        }

        input.close();
    }
}

class InventoryItem{

    private String productName;
    private int stock;

    public InventoryItem(String productName,int initialStock){

        setProductName (productName);
        setInitialStock(initialStock);
        
    }

    public String getProductName(){
        return productName;
    }

    public int getStock(){
        return stock;
    }

    public void addStock(int amount){
        
        if(amount>0){
            
            stock += amount;

            System.out.println("Stock added.");
        }
        else if(amount<=0){
            System.out.println("Invalid amount.");
        }
    }

    public void sellStock(int amount){

        if(amount > 0 && amount<= stock){
            
            stock -= amount;

            System.out.println("Sale successful.");
        }
        else if(amount>stock){
            System.out.println("Not enough stock.");
        }
        else{
            System.out.println("Invalid amount.");
        }
    }

    public void setInitialStock(int initialStock){ //เมธอดเซตสต็อกเริ่มต้น
        if(initialStock >= 0){
            this.stock = initialStock;
        }
        else if(initialStock<0){
            this.stock = 0;
        }
    }

    public void setProductName(String productName){ //เช็คชื่อสินค้า
        if(productName == null || productName.isEmpty()){
            throw new IllegalArgumentException("Product name cannot be null or empty.");
        }
        this.productName = productName;
    }
}