package LAB3.lab3p1;

public class User {
    
    private String userName;

    public User(String name){

       setName(name);

    }

    public String getUsername(){

        return userName;
    }

    public void setName(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("User name cannot be null or empty");
        }
        this.userName = name ;
    }

}
