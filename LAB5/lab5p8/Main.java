package LAB5.lab5p8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String Studentname = input.nextLine();
        int studentID = input.nextInt();

        input.nextLine();

        String employeeName = input.nextLine();
        double salary = input.nextDouble();

        Student s1 = new Student(Studentname, studentID);
        Employee e1 = new Employee(employeeName, salary);

        Person[] p1 = {s1 , e1};

        for(int i = 0;i<p1.length;i++){
            if(p1[i] instanceof Employee){
                Employee employee = (Employee) p1[i];
                employee.applyBonus(1000);
            }

            System.out.println(p1[i].getStatus());
            
        }
    }
    

}
