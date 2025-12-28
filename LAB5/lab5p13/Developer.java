package LAB5.lab5p13;

public class Developer extends User{
    
    protected int projects;

    public Developer(String name,int projects){
        super(name);
        this.projects=projects;
    }
    @Override
    public int getClearanceLeve(){
        return 2;
    }
}
