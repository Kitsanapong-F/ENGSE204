package LAB2.lab2p2;

import java.util.Scanner;

import LAB2.lab2p3.Student;

public class lab2 {
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     String name = input.nextLine();
     String studenId = input.nextLine();
     Student s1 = new Student(name,studenId);
     s1.displayinfo();
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

        public void displayinfo(){
        System.out.println(this.name);
        System.out.println(this.studenId);
        }

    }


