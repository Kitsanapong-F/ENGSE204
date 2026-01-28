package LAB5.lab5p11;
//supclass
public class PDFDocument extends Document{
    
    protected int pageCount;

    public PDFDocument(String title,int pageCount){
        super(title);
        setPagecount(pageCount);
    }

    public void setPagecount(int pageCount){
        if(pageCount<0){
            pageCount = 0;
        }
        this.pageCount=pageCount;
    }

    @Override
    public void displayDetails(){
        System.out.println("PDF: "+this.title+" Page: "+this.pageCount);
    }
}
