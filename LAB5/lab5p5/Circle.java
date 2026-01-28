package LAB5.lab5p5;
//supclass
public class Circle extends Shape {
    
    protected double radius;

    public Circle(String name,double radius){
        super(name);
        this.radius=radius;
    }

    @Override
    public double calculateArea(){
        return (this.radius*this.radius)*(3.14159);
    }
}
