package LAB5.lab5p9;

public class PhysicalProduct extends Item{
    
    protected double unitPrice;
    protected int quantity;

    public PhysicalProduct(String name , double unitPrice , int quantity){
        super(name);
        setQuantity(quantity);
        setUnitprice(unitPrice);

    }

    public void setUnitprice(double unitPrice){
        if(unitPrice<0){
            unitPrice=0;
            System.out.println("The unit price cannot be negative.");
        }
        this.unitPrice=unitPrice;
    }

     public void setQuantity(int quantity){
        if(quantity<0){
            quantity=0;
            System.out.println("The quantity price cannot be negative.");
        }
        this.quantity=quantity;
    }

    @Override
    public double getValue(){
        return this.unitPrice*this.quantity;
    }
}
