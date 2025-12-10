package LAB3.lab3p3;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String defaultPassword = input.nextLine();
        String newPassword = input.nextLine();

        try{
            User u1 = new User(defaultPassword);
            
            u1.setPassword(newPassword);
            u1.display();
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        input.close();

    }

}

class User {
    
    private String password;

    public User(String initialPassword){
        
        setpass(initialPassword);
        
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String initialPassword){

        if(initialPassword.length() >= 8){
            
            setpass(initialPassword);

            System.out.println("Password updated");

            this.password = initialPassword;
        }
        else if(initialPassword.length()<=7){
            
            setpass(initialPassword);

            System.out.println("Password is too short");

        }
        
    }
    
    public void setpass(String initialPassword){
        
        if( initialPassword  == null || initialPassword.isEmpty()){ 
            throw new IllegalArgumentException("Password cannot be null or empty");
        }
        this.password = initialPassword;
       
    }

    public void display(){
        System.out.println(getPassword());
    }

}

