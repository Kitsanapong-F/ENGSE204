package LAB3.lab3p15;

import java.util.Scanner;

public class Lab15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       try{ 
            String username = input.next();

            User u1 = new User(username);

            int N = input.nextInt();

            for(int i = 0;i < N;i++){

                String mode = input.next();

                if(mode.equals("SET_POLICY")){

                    int max = input.nextInt();

                    u1.setPolicy(max);

                }  
                else if(mode.equals("LOGIN")){

                    String password = input.next();

                    u1.login(password);

                }
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        input.close();

    }
}

class User{

    private String username;
    private int failedAttempts;
    private boolean isLocked;
    private static int maxAttempts = 3;

    public User(String username){
        
        setUsername(username);
        this.failedAttempts = 0;
        this.isLocked = false;

    }
    
    public static void setPolicy(int max){

        if(max>0){
            
            maxAttempts = max;
            
            System.out.println("Policy updated");

        }
        else if(max<=0){
            
            System.out.println("Incalid policy");

        }
    }

    public String getUsername(){
        return username;
    }

    public boolean isLocked(){
        return isLocked;
    }

    public int getFailedAttempts(){
        return failedAttempts;
    }

    public void login(String password){
        if(isLocked == true){
            
            System.out.println("Account is Locked");

        }
        else if(isLocked == false && password.equals("pass123")){

            failedAttempts = 0;

            System.out.println("Login successful");

        }
        else if(isLocked == false && !password.equals("pass123")){

            failedAttempts++;

            if(failedAttempts>=maxAttempts){
                
                isLocked = true;

                System.out.println("Login failed. Account locked.");

            }
            else if(failedAttempts<maxAttempts){

                System.out.println("Loginfaled. "+(maxAttempts-failedAttempts)+" attempts left.");

            }
        }
    }

    public void setUsername(String username){
          if(username == null || username.isEmpty()){
            throw new IllegalArgumentException("User name cannot be null or empty");
        }
        this.username = username ;
    }
}
