package LAB5.lab5p1;
//superclass
public class Animal {
    
    protected String name;
    protected int age;

    public Animal(String name,int age){
        System.out.println("[Animal Constructor] is running...");
        this.name = name;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Name"+name+"Age"+age);
    }
}
