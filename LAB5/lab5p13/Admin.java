package LAB5.lab5p13;

public class Admin extends Developer{
    
    protected String adminKey;

    public Admin(String name , int projects , String adminKey){
        super(name, projects);
        this.adminKey=adminKey;
    }

    @Override
    public int getClearanceLeve(){
        return 3;
    }

    public String getAdminkey(){
        return this.adminKey;
    }
}
