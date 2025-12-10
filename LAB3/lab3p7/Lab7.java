package LAB3.lab3p7;

import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String employeeId = input.nextLine();
        String department = input.nextLine();
        String newDepartment = input.nextLine();

        Employee e1 = new Employee(employeeId,department);

        e1.setDepartment(newDepartment);

        System.out.println(e1.getEmployeeId());
        System.out.println(e1.getDepartment());
    }
     
}

class Employee{
    
    private String employeeId;
    private String department;

    public Employee(String employeeId,String department){

        this.employeeId = employeeId;
        this.department = department;

    }

    public String getEmployeeId(){
        return employeeId;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String newDepartment){
        this.department = newDepartment;
    }
}

