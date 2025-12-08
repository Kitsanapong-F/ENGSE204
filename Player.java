package LAB3.lab3p2;

public class Player {

    private int score;

    public Player(int score){
        setScore(score);
    }

    public int getScore(){
        return score;
    } 

    public void setScore(int score){

        if(  score < 0){
            throw new IllegalArgumentException("Score must not be negative.");
        }
        
        this.score =  score;

    }
}
