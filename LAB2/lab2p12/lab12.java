package LAB2.lab2p12;
import java.util.Scanner;
public class lab12 {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    String courseId = input.nextLine();
    String coursename = input.nextLine();
    String name = input.nextLine();
    Course c1 = new Course(courseId, coursename);
    Student s1 = new Student(name, c1);
    s1.displayProfileEnrollment();
    input.close();
   
    }
    
}

class Course{
    
    private String courseld;
    private String coursename;

    public Course(String courseld, String coursename){
        
        this.courseld = courseld;
        this.coursename = coursename;

    }

    public String getCourselnfo(){
        return courseld +":"+ coursename;
    }

}

class Student{

    private String studentName;
    private Course enrolledCourse;
    
    public Student(String name , Course c1){

        this.studentName = name;
        this.enrolledCourse = c1;  
    }

    public void displayProfileEnrollment(){

        System.out.println("Student:"+studentName);
        System.out.println("enrolled in:"+enrolledCourse.getCourselnfo());
    }
}





