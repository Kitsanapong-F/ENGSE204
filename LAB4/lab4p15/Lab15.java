package LAB4.lab4p15;

import java.util.Scanner;

public class Lab15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //รับค่า
        int max = input.nextInt();
        AuditRecord.setPolicy(max);
        input.nextLine();

        String user = input.nextLine();

        AuditRecord a1 = new AuditRecord(user);

        int n = input.nextInt();
       
        for(int i = 0; i<n;i++){
            String maessages = input.nextLine();
            a1 = a1.addMessage(maessages);
        }

        a1.displayLog(); //แสดงข้อมูล

        input.close();
    }
}
class AuditRecord{
    
    private final String user;
    private final String[] logMessages;
    private static int maxMaessages = 3;

    public AuditRecord(String user){
        this(user,new String[0]);
    }

    public AuditRecord(String user , String[] logs){
       
        this.user = user;
       
        if(logs.length>maxMaessages){
            this.logMessages= new String[maxMaessages];

            for(int i = 0;i<maxMaessages;i++){
                this.logMessages[i] = logs[logs.length-maxMaessages+1];
            }
        }
        else{
            this.logMessages = new String[logs.length];
            for(int i= 0 ; i<logs.length ; i++){
                this.logMessages[i] = logs[i];
            }
        }
    }
    //เมธอดเซตค่าmax
    public static void setPolicy(int max){
        if(max>0){
            maxMaessages = max;
            System.out.println("policy set to "+max);
        }
        else if(max<=0){
            System.out.println("Invalid policy");
        }
    }

     public AuditRecord addMessage(String message) {

        if (logMessages.length < maxMaessages) {

            String[] newLogs = new String[logMessages.length + 1];

            for (int i = 0; i < logMessages.length; i++) {
                newLogs[i] = logMessages[i];
            }

            newLogs[newLogs.length - 1] = message;

            return new AuditRecord(this.user, newLogs);

        } else {
            System.out.println("Log is full.");
            return this; 
        }
    }
    //เมธอดแสดงข้อมูล
    public void displayLog() {
        
        System.out.print("User: " + user + ", Logs: " + logMessages.length + " [");

        for (int i = 0; i < logMessages.length; i++) {
            System.out.print(logMessages[i]);
            if (i < logMessages.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}