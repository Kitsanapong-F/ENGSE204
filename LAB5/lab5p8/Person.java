package LAB5.lab5p8;
//supclass
public class Person {
    
    protected String name;

    public Person(String name){
        setName(name);
    }

    public void setName(String name){
        if(name ==null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public String getStatus(){
        return ("Person: "+this.name);
    }
}
