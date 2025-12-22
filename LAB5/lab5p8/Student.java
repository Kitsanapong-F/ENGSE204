package LAB5.lab5p8;

public class Student extends Person{
    
    protected int studentld;

    public Student(String name , int studentld){
        super(name);
        this.studentld=studentld;
    }

    @Override
    public String getStatus(){
        return ("Student: "+this.name+" ID: "+this.studentld);
    }
}
