package LAB5.lab5p3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salary = input.nextDouble();
        
        Manager m1 = new Manager(salary);

        System.out.println(m1.calculateBonus());
    }
}
