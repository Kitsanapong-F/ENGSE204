package LAB5.lab5p10;
//superclass
public class ProjectTask {
    protected String description;
    protected int baseHours;

    public  ProjectTask(String desc,int hours){
        setdescription(desc);
        sethours(hours);
    }

    public void setdescription(String desc){
        if(desc == null || desc.isEmpty()){
            throw new IllegalArgumentException("description cannot be null or isempty");
        }
    }

    public void sethours(int hours){
        if(hours<0){
            hours=0;
        }
        this.baseHours=hours;
    }
    public double calculrateCost(){
        return this.baseHours*50.0;
    }
}
