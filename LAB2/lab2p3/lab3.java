package LAB2.lab2p3;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numBer = input.nextInt();

        for(int i = 0;i<numBer;i++){ //ลูปรับค่าid และ name
            
            String id = input.next();
            String name = input.next();
            new Student(id,name);  //สร้างออบเจ็กต์Student
        }

        System.out.println(Student.studentCount);

    }
}

class Student{
   
    private String sudentId;
    private String name;
    static int studentCount = 0;

    public Student(String id , String name){

        this.sudentId = id;
        this.name = name;
        studentCount++;

    }
   
}
