package LAB2;
import java.util.Scanner;

import LAB2.lab2p9.Student;
public class lab1 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     String name = input.nextLine();
     String studenId = input.nextLine();
     Student s1 = new Student(name,studenId);
     s1.show();
     input.nextLine();
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
