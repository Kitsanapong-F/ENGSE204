package LAB3.lab3p5;

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String connectionString = input.nextLine();

        DatabaseConnection d1 = new DatabaseConnection(connectionString);

        d1.connect();
        d1.disconnected();
        d1.disconnected();

        System.out.println(d1.isConnected());
    }
}

class DatabaseConnection{

    private String connectionsString;
    private boolean connected;

    public DatabaseConnection(String connectionsString){

        this.connectionsString = connectionsString;
        this.connected = false;
    }
    
    public boolean isConnected(){
        return connected;
    }

    public void connect(){
        if(connected == false){
            
            connected = true;

            System.out.println("Connected to "+connectionsString);
        }
        else if(connected == true){

            System.out.println("Already disconnected");

        }
    }

    public void disconnected(){
        if(connected == true){
            
            connected = false;
            
            System.out.println("Disconnected");
        }
        else if(connected == false){
            
            System.out.println("Already disconnected");

        }
    }

}
