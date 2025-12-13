package LAB3.lab3p5;

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String connectionsString = input.nextLine();

        DatabaseConnection d1 = new DatabaseConnection(connectionsString); //สร้างออบเจ็กต์ 

        d1.connect();                                                      //เรียกใช้เมธอดconnect
        d1.disconnected();                                                    //เรียกใช้เมธอด.disconnected
        d1.disconnected();

        System.out.println(d1.isConnected());

        input.close();

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
        if(!connected){ //ถ้าconnected มีค่าเป็นfalse
            connected = true;
            System.out.println("Connected to "+connectionsString);
        }
        else { //ถ้าconnected มีค่าเป็น true
            System.out.println("Already connected");
        }
    }

    public void disconnected(){
        if(connected){  //ถ้าconnected มีค่าเป็น true
            connected = false;
            System.out.println("Disconnected");
        }
        else { //ถ้าconnected มีค่าเป็นfalse
            System.out.println("Already disconnected");
        }
    }
}
