package LAB5.lab5p9;
//superclass
public class Item {
    
    protected String name;

    public Item(String name){
        setName(name);
    }

    public void setName(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name =name;
    }

    public double getValue(){
        return 0.0;
    }
}   
