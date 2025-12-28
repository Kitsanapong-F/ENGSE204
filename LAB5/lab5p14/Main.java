package LAB5.lab5p14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);

        String id = input.nextLine();
        double baseFeestandard = input.nextDouble();
        input.nextLine();
        String idPremium = input.nextLine();
        double baseFeepremium = input.nextDouble();
        double insuranceFee = input.nextDouble();

        Standardshipping s1 = new Standardshipping(id,baseFeestandard);
        Premiumshipping p1 = new Premiumshipping(idPremium, baseFeepremium, insuranceFee);

        shipping[] shippings = {s1,p1};

        for(int i = 0;i<shippings.length;i++){
            System.out.println(shippings[i].calculateTotolfee());
        }
    }
    
}
