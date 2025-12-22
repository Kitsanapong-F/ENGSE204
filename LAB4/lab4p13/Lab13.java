package LAB4.lab4p13;

import java.util.Scanner;

public class Lab13 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        //ตั้งค่านโยบาย
        int max = input.nextInt();

        input.nextLine();

        String name = input.nextLine();
        
        int D1 = input.nextInt();
        int D2 = input.nextInt();
        int D3 = input.nextInt();

        Supscription s1 = new Supscription(name, D1); //สร้างอบบเจ็กต์
        Supscription.setMaxDuration(max);

        s1 = s1.extend(D2);
        s1 = s1.extend(D3);

        s1.displayInfo();

        input.close();
    }  
}

class Supscription{

    private final String planName;
    private final int durationDays;
    private static int maxDuration = 365;

    public Supscription(String planName,int durationDays){
     
        this.planName=planName;
        
        if (durationDays>maxDuration) {
            this.durationDays=maxDuration;
        }
        else if(durationDays<0){
            this.durationDays=0;
        }
        else{
            this.durationDays=durationDays;
        }
    }

    public Supscription(Supscription other){
       
        this.planName = other.planName;
        this.durationDays=other.durationDays;
    
    }

    public static void setMaxDuration(int max){
        if(max>0){
           maxDuration = max;
           System.out.println("Max duration set to "+maxDuration);
        }
        else if(max<=0){
            System.out.println("Invalid max policy.");
        }
    }

    public Supscription extend(int days){
        if(days<=0){
            System.out.println("Invalid extension days.");
            return this;
        }
        
        int newday = days;

        if(this.durationDays+newday>maxDuration){
            System.out.println("Extension failed:Exceeds max policy.");
            return this;
        }
        else{
            System.out.println("Extension successful.");
            return new Supscription(this.planName,this.durationDays+newday);
        }
      

    }

    public void displayInfo(){
        System.out.println("Plan"+planName+"Day:"+durationDays);
    }
}