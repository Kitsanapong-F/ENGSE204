package LAB2.lab2p4;
import java.util.Scanner;
public class lab4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int midtermScore = input.nextInt();
        int finalScore = input.nextInt();
        Ftudent s1 = new Ftudent(name,midtermScore,finalScore);
        s1.displayinfo();
        input.close();
    }
}

class Ftudent {
    private String name;
    private int midtermScore;
    private int finalScore;
    
    public Ftudent(String name,int midtermScore,int finalScore){
        this.name=name;
        this.midtermScore=midtermScore;
        this.finalScore = finalScore;
    }

    public double calculateAverrage(){
        return ((midtermScore+finalScore)/2.0);
    }

    public void displayinfo(){
        System.out.println("Name:"+name);
        System.out.printf("Average Score: %.2f\n",calculateAverrage());
        if(calculateAverrage()>50.0){
            System.out.println("Status:pass");
        }
        else{
            System.out.println("Status:Fail");
        }
    }
    
}
