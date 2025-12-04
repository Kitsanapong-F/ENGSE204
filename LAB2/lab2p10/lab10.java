package LAB2.lab2p10;
import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Product[] arrItems = new Product[10];
        
        int num = input.nextInt();
        input.nextLine(); 
        
        ShoppingCart s1 = new ShoppingCart(arrItems, 0);

        for(int i = 0; i < num; i++) {
          
            String name = input.nextLine();   
            double price = input.nextDouble();
            input.nextLine(); 
            
            Product p = new Product(name, price);
            
            s1.addProduct(p);
            
        }

        System.out.println(s1.calculatePrice());

        input.close();
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private Product[] items;
    private int itemsCount;

    public ShoppingCart(Product[] arrItems, int itemsCount) {
        this.items = arrItems;
        this.itemsCount = itemsCount;
    }

    public void addProduct(Product p) {
        items[itemsCount] = p;
        itemsCount++;
    }

    public double calculatePrice() {
        double sum = 0;
        for(int j = 0; j < itemsCount; j++) {
            sum += items[j].getPrice();
        }
        return sum;
    }
}
