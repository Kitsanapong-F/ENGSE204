package LAB5.lab5p1;
//supclass
public class Dog extends Animal {
    
    public Dog(String name,int age){
        super(name, age);
        System.out.println("[Dog Constructor]");
    }

    public void makeSound(){
        System.out.println("Woof! Woof!");
    }
}
