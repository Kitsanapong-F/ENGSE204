package LAB5.lab5p7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nameSales = input.nextLine();
        double salarySales = input.nextDouble();
        double rateSales = input.nextDouble();

        input.nextLine();

        String nameManager = input.nextLine();
        double salaryManager = input.nextDouble();
        double rateManager = input.nextDouble();

        SalesEmployee s1 = new SalesEmployee(nameSales, salarySales, rateSales);
        Manager m1 = new Manager(nameManager, salaryManager, rateManager);

        PalrollProcessor.process(s1);
        PalrollProcessor.process(m1);
    }
}
