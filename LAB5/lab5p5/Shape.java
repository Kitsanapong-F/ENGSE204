package LAB5.lab5p5;

public class Shape {
    
    protected String name;

    public Shape(String name){
        setName(name);
    }

    public void setName(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name=name;
    }

    public double calculateArea(){
        return 0.0;
    }
}
