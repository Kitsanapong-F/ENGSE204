package LAB3.lab3p10;

import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for(int i = 0;i<N ;i++){
            
            String mode = input.next();
            if(mode.equals("SET")){
                
                int newLevel = input.nextInt();

                SystemLogger.setLogLevel(newLevel);
            }
            else if(mode.equals("LOG")){
                
                int messageLevel = input.nextInt();
                input.nextLine();
                String message = input.nextLine();
                
                SystemLogger.log(messageLevel, message);
            }

        }
    }
   

    
}

class SystemLogger{

    private static int currentLogLevel = 1;

    private static String getLevelName(int level){

        if(level == 1){

           return "INFO"; 
        }

        else if(level == 2){
           return "DEBUG"; 
        }
        
        else if(level == 3){
           return "ERROR"; 
        }
        else{
            return "UNKNOWN";
        }
    }

    public static void setLogLevel(int newLevel){

        if(newLevel >= 1 && newLevel<=3){

            currentLogLevel = newLevel;

            System.out.println("Log level set to "+getLevelName(currentLogLevel));
        }
        else{
            System.out.println("Invalid log level.");
        }

    }

    public static void log(int messageLevel,String message ){

        if(messageLevel>=currentLogLevel){
            System.out.println("["+getLevelName(messageLevel)+"]:"+message);
        }
    }
}



