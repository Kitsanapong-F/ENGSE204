package LAB5.lab5p9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namePhysicalProduct = input.nextLine();
        double unitPrice = input.nextDouble();
        int quantity = input.nextInt();
        
        input.nextLine();

        String nameDIgitalSubscription = input.nextLine();
        double monthlyCost = input.nextDouble();
        int months = input.nextInt();

        PhysicalProduct p1 = new PhysicalProduct(namePhysicalProduct, unitPrice, quantity);
        DIgitalSubscription d1 = new DIgitalSubscription(nameDIgitalSubscription, monthlyCost, months);

        Item[] i1 = {p1 , d1};

        double totalValue = 0;

        for(int i = 0;i<i1.length;i++){
            totalValue += i1[i].getValue();
        }

        System.out.println(totalValue);
        
        input.close();
    }
}
