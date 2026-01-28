package LAB5.lab5p6;
//superclass
public class Media {
    
    protected String title;

    public Media(String title){
        settitle(title);
    }

    public void process(){
        System.out.println("Start generic media");
    }

    public void settitle(String title){
        if(title == null || title.isEmpty()){
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }
}
