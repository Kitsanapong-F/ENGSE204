package LAB3.lab3p9;

import java.util.Scanner;

public class LAb9 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int minLength1 = input.nextInt();
            
            String user1_name = input.next();
            String user1_pass = input.next();
            
            String user2_name = input.next();
            String user2_pass = input.next();

            int minLength2 = input.nextInt();
            
            String user2_newpass = input.next();

            User.setMinlength(minLength1);
            
            User user1 = new User(user1_pass, user1_pass);
            User user2 = new User(user2_pass, user2_pass);
            
            User.setMinlength(minLength2);

            user2.setPassword(user2_newpass);

            System.out.println(user1.getPassword());
            System.out.println(user2.getPassword());
        }
}

class User{

    private String userName;
    private String password;
    private static int minPasswordLength = 8;

    public static void setMinlength(int length){

        if(length<4){

            System.out.println("Invalid length");

        }
        else if(length>=4){

            minPasswordLength = length;

            System.out.println("New min length set to "+length);
            
        }
    }

    public static int getMinlength(){
        return minPasswordLength;
    }

    public User(String username,String password){

        if(password.length()>=minPasswordLength){
            
            this.password = password;

            System.out.println("Creation successful.");
        }
        else if(password.length()<minPasswordLength){
            
            this.password = "invalid";

            System.out.println("Creation failed.");
        }
    }

    public void  setPassword(String newPassword){

        if(newPassword.length()>=minPasswordLength){

            this.password = newPassword;

            System.out.println("Update successful.");
        }
        else if(newPassword.length()<minPasswordLength){
            System.out.println("Update failed.");
        }
    }

    public String getPassword(){
        return password;
    }
}


