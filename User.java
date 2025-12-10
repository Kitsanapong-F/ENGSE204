

public class User {
    
    private String password;

    public User(String initialPassword){
        
        setpass(initialPassword);
        
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String initialPassword){

        if(initialPassword.length() >= 8){
            
            setpass(initialPassword);

            System.out.println("Password updated");

            this.password = initialPassword;
        }
        else if(initialPassword.length()<=7){

            System.out.println("Password is too short");

        }
        
    }
    
    public void setpass(String initialPassword){
        
        if( initialPassword  == null ){ 
            throw new IllegalArgumentException("Score must not be negative.");
        }
        this.password = initialPassword;
       
    }

    public void display(){
        System.out.println(getPassword());
    }

}
