package LAB5.lab5p11;
//superclass
public class Document {
    
    protected String title;

    public Document(String title){
        setTitle(title);
    }

    public void displayDetails(){
        System.out.println("Document: "+this.title);
    }

    public void setTitle(String title){
        if(title == null || title.isEmpty()){
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title=title;
    }
}
