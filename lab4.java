import java.util.Scanner;
public class lab4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numBer = input.nextInt();
        System.out.println(add(numBer));
        input.close();
    }

    public static String add(int a){
        String G;
        if(a>=80&&a<=100){
            G = "A";
        }
        else if(a>=70&&a<=79){
            G = "B";
        }
         else if(a>=60&&a<=69){
            G = "C";
        }
         else if(a>=50&&a<=59){
            G = "D";
        }
         else if(a>=0&&a<=49){
            G = "F";
        }
        else{
            G = "ERROR";
        }

        return G;
    }
}
