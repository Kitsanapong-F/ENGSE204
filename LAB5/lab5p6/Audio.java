package LAB5.lab5p6;
//supclass
public class Audio extends Media{
    protected String quality;

    public Audio(String title , String quality){
        super(title);
        setQuality(quality);
    }

    public void setQuality(String quality){
        if(quality == null || quality.isEmpty()){
            throw new IllegalArgumentException("Quality cannot be null or empty");
        }
        this.quality=quality;
    }

    @Override
    public void process(){
        System.out.println("Processing audio: "+title+" with "+quality+" quality.");
    }
}
