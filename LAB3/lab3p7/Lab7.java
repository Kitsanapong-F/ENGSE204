package LAB3.lab3p7;

import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       try{
        String employeeId = input.nextLine();
        String department = input.nextLine();
        String newDepartment = input.nextLine();

        Employee e1 = new Employee(employeeId,department);

        e1.setDepartment(newDepartment);

        System.out.println(e1.getEmployeeId());
        System.out.println(e1.getDepartment());
       }
       catch(IllegalArgumentException e){
        System.out.println("Error: "+e.getMessage());
       }

        input.close();
    }
     
}

class Employee{
    
    private String employeeId;
    private String department;

    public Employee(String employeeId,String department){

        setemployeeId(employeeId);
        setDepartment(department);

    }

    public String getEmployeeId(){ //เมดธอดส่งค่ารหัสพนักงาน
        return employeeId;
    }

    public String getDepartment(){ //เมดธอดส่งค่าแผนก
        return department;
    }

    public void setDepartment(String newDepartment){ //เมดธอดเซตค่าแผนกใหม่
        
        if(newDepartment == null || newDepartment.isEmpty()){
            throw new IllegalArgumentException("Department cannot be null or empty.");
        }
        this.department = newDepartment;
    }

    public void setemployeeId(String employeeId){
        if(employeeId == null || employeeId.isEmpty()){
            throw new IllegalArgumentException("Employee ID cannot be null or empty.");
        }
        this.employeeId = employeeId;
    }
}

