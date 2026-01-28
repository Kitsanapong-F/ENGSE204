package LAB5.lab5p2;

import LAB5.lab5p1.Dog;
//supclass
public class Cat extends Animal {
    
    public Cat(String name , int age){
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println("Meow!");
    }
}
