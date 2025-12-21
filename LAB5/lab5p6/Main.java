package LAB5.lab5p6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            String titleVideo = input.nextLine();
            int duration = input.nextInt();
            input.nextLine();
            String titleAudio = input.nextLine();
            String quality = input.nextLine();

            Video v1 = new Video(titleVideo, duration);
            Audio a1 = new Audio(titleAudio,quality);

            Processor.runProcessor(v1);
            Processor.runProcessor(a1);
        }
        catch(IllegalArgumentException e){
            System.out.println("Erorr: "+e.getMessage());
        }
        input.close();
    }
}
