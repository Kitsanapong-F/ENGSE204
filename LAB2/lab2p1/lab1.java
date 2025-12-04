package LAB2.lab2p1;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     String name = input.nextLine();
     String studenId = input.nextLine();
     
     Student s1 = new Student(name,studenId); // สร้างออบเจ็กต์Student 
     
     s1.show(); // เรียกใช้เมธอดshow
     
     input.close();
    }
}
    class Student {
       
        private String studenId;
        private String name;
    
    public Student(String name,String studentId){
        
        this.name = name;
        this.studenId = studentId;

    }

    public void show(){
        
        System.out.println(this.name);
        System.out.println(this.studenId);

    }
}
