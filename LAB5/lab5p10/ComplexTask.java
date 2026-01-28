package LAB5.lab5p10;
//supclass
public class ComplexTask extends ProjectTask{
    
    protected double setupFee;

    public ComplexTask(String desc,int hours , double setupFee){
        super(desc, hours);
        setFee(setupFee);
    }

    public void setFee(double setupFee){
        if(setupFee <0){
            setupFee=0;
        }
        this.setupFee=setupFee;
    }
    
    @Override
    public double calculrateCost(){
        return (super.calculrateCost()*1.10)+this.setupFee;
    }
}
