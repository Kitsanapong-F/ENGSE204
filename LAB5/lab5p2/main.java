package LAB5.lab5p2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name = input.nextLine();
        int age = input.nextInt();
        
        Cat cat = new Cat(name, age);

        cat.displayInfo();
        cat.makeSound();
    }
}
