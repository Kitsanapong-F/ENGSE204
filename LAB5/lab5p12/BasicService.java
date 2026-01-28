package LAB5.lab5p12;
//supclass
public class BasicService extends Service{
    
    public BasicService(String name , double basePrice){
        super(name, basePrice);
    }

    @Override
    public double calculateFinalprice(){
        return this.basePrice*1.05;
    }
}
