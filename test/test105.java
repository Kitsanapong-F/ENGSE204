package test;

import java.util.Scanner;
public class test105 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Product[] arritems = new Product[10];
        
        int num = input.nextInt();
        
        
        ShoppingCart s1 =new ShoppingCart(arritems, 0);
        
        for(int i = 0;i<num;i++){
            String name =input.nextLine();
            input.nextLine();
            double price = input.nextDouble();
            Product p = new Product(name, price);
            s1.addProduct(p);
        }
        System.out.println(s1.calculateprice());

        input.close();
    }

}

class Product {

    private String name;
    public double price;

    public Product(String name , double price){
        this.name = name;
        this.price = price;
    }
    
}

class ShoppingCart{
 
    private Product[] items;
    private int itemsCount;

    public ShoppingCart(Product[] arritems ,int itemsCount){
        this.items = arritems;
        this.itemsCount = itemsCount;
    }

    public void addProduct(Product p){
        
        items[itemsCount] = p;
        itemsCount++;

    }

    public double calculateprice(){
        double sum = 0 ;
        for(int j = 0;j<itemsCount;j++){
            sum+=items[j].price;
       }
       return sum;
    }
}