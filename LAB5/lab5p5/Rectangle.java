package LAB5.lab5p5;
//supclass
public class Rectangle extends Shape {
    
    protected double width;
    protected double height;
    
    public Rectangle(String name,double width, double height){
        super(name);
        setHeight(height);
        setWidth(width);

    }

    public void setWidth(double width){
        if(width<0){
            width  = -width;
        }
        this.width=width;
    }

    public void setHeight(double height){
        if(height<0){
            height = -height;
        }
        this.height=height;
    }

    @Override
    public double calculateArea(){
        return (this.width)*(this.height);
    }
}
