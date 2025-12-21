package LAB4.lab4p1;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mode = input.nextInt();
        if(mode == 1){  //เช็คโหมด
            input.nextLine();
            String title = input.nextLine();
            Book b1 = new Book(title);
            b1.displayinfo();
        }
        else if(mode == 2){ //เช็คโหมด
            input.nextLine();
            String title = input.nextLine();
            String author = input.nextLine();
            Book b1 = new Book(title,author);
            b1.displayinfo();
        }
        input.close();
    }    
}
class Book{
    private String title;
    private String author;
    public Book(String title){
        this.title = title;
        this.author = "Unknown";
    }

    public Book(String title,String author){
        this.title = title;
        this.author = author;
    }
    
    public void displayinfo(){ //แสดงข้อมูล
        System.out.println("Title: "+title+" Author: "+author);
    }
}
