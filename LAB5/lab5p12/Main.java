package LAB5.lab5p12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        try{
            String namebasic = input.nextLine();
            double basePricebasic = input.nextDouble();
            input.nextLine();
            String namePremium = input.nextLine();
            double basePricePremium  = input.nextDouble();
            double premiumRate = input.nextDouble();

            BasicService basic1 = new BasicService(namebasic,basePricebasic);
            PremiumService premium1 = new PremiumService(namePremium, basePricePremium, premiumRate);

            Service[] services = {basic1,premium1};

            for(int i = 0;i<services.length;i++){
                System.out.println(services[i].calculateFinalprice());
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
        input.close();
    }
}
