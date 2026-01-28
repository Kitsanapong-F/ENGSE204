package LAB5.lab5p4;
//superclass
public class Vehicle {
    
    protected String color; 
    
    public Vehicle(String color){
        setColor(color);
    }

    public void setColor(String color){
        if(color == null || color.isEmpty()){
            throw new IllegalArgumentException("color cannot be null or empty");
        }
        this.color=color;
    }
}
