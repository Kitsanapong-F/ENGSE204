package LAB2.lab2p4;
import java.util.Scanner;
public class Lab4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name = input.nextLine();
        int midtermScore = input.nextInt();
        int finalScore = input.nextInt();
        
        Student s1 = new Student(name,midtermScore,finalScore); //สร้างออบเจ็กต์Student
        
        s1.displayinfo();
        
        input.close();
    }
}

class Student {
   
    private String name;
    private int midtermScore;
    private int finalScore;
    
    public Student(String name,int midtermScore,int finalScore){ //สร้างคอนสตรัคเตอร์Student
        
        this.name=name;
        this.midtermScore=midtermScore;
        this.finalScore = finalScore;

    }

    public double calculateAverrage(){
        return ((midtermScore+finalScore)/2.0); // คิดคะแนนเฉลี่ย
    }

    public void displayinfo(){
        
        System.out.println("Name:"+name);
        System.out.printf("Average Score: %.2f\n",calculateAverrage());
        
        if(calculateAverrage()>50.0){ //เช็คว่าผ่านหรือไม่
            System.out.println("Status:pass");
        }
        else{
            System.out.println("Status:Fail");
        }
    }
    
}
