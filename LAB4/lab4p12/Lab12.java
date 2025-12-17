package LAB4.lab4p12;

import java.util.Scanner;

public class Lab12 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        int start = input.nextInt();
        int newHour = input.nextInt();
        Schedule sch1 = new Schedule(start);
        EmployeeSchedule emp1 = new EmployeeSchedule(name, sch1);
        EmployeeSchedule emp2 = new EmployeeSchedule(emp1);
        sch1.setHour(newHour);

        emp1.displaySchedule();
        emp2.displaySchedule();
    }
}

class Schedule{

    private int hour;

    public Schedule(int hour){
        this.hour=hour;
    }

    public void setHour(int newHour){
        this.hour = newHour;
    }

    public int getHour(){
        return hour;
    }

}

class EmployeeSchedule{
    
    private String name;
    private Schedule schedule;

    public EmployeeSchedule(String name,Schedule schedule){
        this.name=name;
        this.schedule = schedule;
    }

    public EmployeeSchedule(EmployeeSchedule other){

        this.name= other.name;
        this.schedule = new Schedule(other.schedule.getHour());
        
    }

    public void displaySchedule(){
        System.out.println(name+":"+schedule.getHour()+":00");
    }
}
