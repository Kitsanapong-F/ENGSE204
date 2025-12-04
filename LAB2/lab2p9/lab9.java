package LAB2.lab2p9;

import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name = input.nextLine();
        String street = input.nextLine();
        String city = input.nextLine();
        String zipCode = input.nextLine();

        Address a1 = new Address(street, city, zipCode); // สร้างออบเจ็กต์ Address
        Student s1 = new Student(name, a1); // สร้างออบเจ็กต์ Student

        s1.displayProfile(); // เรียกใช้เมธอด displayProfile
        input.close();
    }
}
class Address {

    private String street;
    private String city;
    private String zipCode;

    public Address(String street,String city,String zipCode){
        
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;

    }
    
    public String getFullAddress(){
        return  street + ", " + city + ", " + zipCode;
    }
}

class Student{
    
    private String name;
    private Address add;
    
    public Student(String name , Address a1){
       
        this.name =name;
        this.add = a1;

    }

    public void displayProfile(){
        
        System.out.println("Name "+name);
        System.out.println("Address "+add.getFullAddress());

    }
}


