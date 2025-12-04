package LAB3.lab3p1;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        User a1 = new User(name);
        
        System.out.println(a1.getUsername());

        input.close();
    }
}

class User{

    private String username;

    public User(String name){

        username=name;
    }

    public String getUsername(){

        return username; 
    }
}