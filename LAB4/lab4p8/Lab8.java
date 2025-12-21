package LAB4.lab4p8;

import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mode = input.nextInt();
        input.nextLine();

        //เช็คโหมด
        if(mode == 1){
            String title = input.nextLine();
            Movie m1 = new Movie(title);
            m1.displayDetails();
        }
        else if(mode == 2){
            String title = input.nextLine();
            String director = input.nextLine();
            Movie m1 = new Movie(title, director);
            m1.displayDetails();
        }
        else if(mode == 3){
            String title = input.nextLine();
            String director = input.nextLine();
            double rating = input.nextDouble();
            Movie m1 = new Movie(title, director, rating);
            m1.displayDetails();
        }
        input.close();
    }
}
class Movie{

    private String title;
    private String director;
    private double rating;

    public Movie(String title){
        this(title, "Unknown");
    }

    public Movie(String title,String director){

        this(title,director,0.0);
    }

    public Movie(String title,String director,double rating){

        if(rating>10.0){
            rating = 10.0;
        }
        else if(rating<0.0){
            rating=0.0;
        }
        this.title = title;
        this.director =director;
        this.rating = rating;


    }

    public void displayDetails(){
        System.out.println("Title:"+title+"Director:"+director+"Rating:"+rating);
    }
}

