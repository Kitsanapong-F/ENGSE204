package LAB4.lab4p10;

import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int mode = input.nextInt();

        if (mode == 1) {
            TimePeriod t1 = new TimePeriod();
            t1.displayPeriod();
        }
        else if(mode == 2){
            int startHour = input.nextInt();
            int endHour = input.nextInt();
            TimePeriod t1 = new TimePeriod(startHour,endHour);
            t1.displayPeriod();
        }
    }
}

class TimePeriod{

    private int startHour;
    private int endHour;

    public TimePeriod(){
        this(9,17);
    }

     public TimePeriod(int startHour,int endHour){
        if(startHour>=0 && startHour<=23){
            this.startHour =startHour;
        }
        else if(startHour>23){
            startHour=23;
        }
        else if(startHour<0){
            startHour=0;
        }

        if(endHour>=0 && endHour<=23){
            this.endHour=endHour;
        }
        else if(endHour>23){
            endHour=23;
        }
        else if(endHour<0){
            endHour=0;
        }

        if(startHour>endHour){
            startHour = startHour-endHour;
            endHour = startHour +endHour;
            startHour = endHour-startHour;
        }

        this.startHour=startHour;
        this.endHour = endHour;
    }

    public void displayPeriod(){
        System.out.println(startHour+":00"+"-"+endHour+":00");
    }
}

