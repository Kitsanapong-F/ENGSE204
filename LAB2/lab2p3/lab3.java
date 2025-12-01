package LAB2.lab2p3;
import java.util.Scanner;
public class lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();
         input.nextLine();
        for(int i = 0;i<c;i++){
            String id = input.nextLine();
            String na = input.nextLine();
            new Student(id, na); 
        }
        System.out.println(Student.studentcount);
        input.close();
    }
}
class Student{
    private String name;
    private String studentID;
    static int studentcount = 0;

    public Student(String id ,String na){
        this.name = na;
        this.studentID = id;
        studentcount++;
    }
}
