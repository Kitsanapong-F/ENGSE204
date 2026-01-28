package LAB5.lab5p6;
//supclass
public class Video extends Media{    
    
    protected int duration;

    public Video(String title , int duration){
        super(title);
        setDuration(duration);
    }

    public void setDuration(int duration){
        if(duration<0){
            duration = -duration;
        }
        this.duration = duration;
    }

    @Override
    public void process(){
        System.out.println("video: "+title+" for "+duration+" minutes");
    }
}
