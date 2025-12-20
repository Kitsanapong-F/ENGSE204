package LAB5.lab5p1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        int age = input.nextInt();

        Dog dog = new Dog(name, age);
        dog.makeSound();
        dog.displayInfo();
    }
}
