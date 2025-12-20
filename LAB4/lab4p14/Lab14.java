package LAB4.lab4p14;

import java.util.Scanner;

public class Lab14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        int[] orginalScore = new int[3];
        orginalScore[0] = input.nextInt();
        orginalScore[1] = input.nextInt(); 
        orginalScore[2] = input.nextInt();

        ScoreBoard s1 = new ScoreBoard(name, orginalScore);
        ScoreBoard s2 = new ScoreBoard(s1);
        orginalScore[0] = input.nextInt();

        s1.displayScore();
        s2.displayScore();
    }    
}
class ScoreBoard{

    private final String gameName;
    private final int[] scores;

    public ScoreBoard(String gameName , int[] scores){

        this.gameName=gameName;
        this.scores = scores;
    }

    public ScoreBoard(ScoreBoard other){
        
        this.gameName = other.gameName;
        this.scores = new int[other.scores.length];

        for(int i = 0; i<other.scores.length; i++){
            this.scores[i]= other.scores[i];
        }
    }

    public void displayScore(){
        System.out.println(gameName+":"+scores[0]+","+scores[1]+","+scores[2]);
    }
}   
