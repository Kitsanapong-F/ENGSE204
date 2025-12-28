package LAB5.lab5p12;

public class Service {
    
    protected String name;
    protected double basePrice;

    public Service(String name , double basePrice){
        
        setName(name);
        setBaseprice(basePrice);

    }

    public void setName(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name=name;
    }

    public void setBaseprice(double basePrice){
        if(basePrice < 0){
            basePrice = 0;
        }
        this.basePrice=basePrice;
    }

    public double calculateFinalprice(){
        return this.basePrice;
    }
}
