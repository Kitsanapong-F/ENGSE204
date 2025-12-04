package LAB2.lab2p3;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int quantity = input.nextInt();
    
        for(int i = 0;i<quantity;i++){ //ลูปรับค่า id และ name
           
            String id = input.next();
            String name = input.nextLine();
            
            new Student(id, name ); //สร้างออบเจ็กต์Student
           
        }
        
        System.out.println(Student.studentcount);

        input.close();
    }
}
class Student{
   
    private String name;
    private String studentID;
    static int studentcount = 0;

    public Student(String id ,String name){
        
        this.name = name;
        this.studentID = id;
        studentcount++;
    }
}
