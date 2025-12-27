package LAB5.lab5p11;

public class TextDocument extends Document{
    
    protected int wordCount;

    public TextDocument(String title,int wordCount){
        super(title);
        setwordCount(wordCount);
    }

    public void setwordCount(int wordCount){
        if(wordCount<0){
            wordCount=0;
        }
        this.wordCount=wordCount;
    }

    @Override
    public void displayDetails(){
        System.out.println("Text: "+title+"Words: "+this.wordCount);
    }
}
