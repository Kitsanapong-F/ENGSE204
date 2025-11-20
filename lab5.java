import java.util.Scanner;
public class lab5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Menu Number ");
        int numBer = input.nextInt();
        System.out.println(add(numBer));
        input.close(); 
    }
    public static String add(int a){
        String meNu;
        if(a==1){
            meNu = "Americano";
        }
        else if(a==2){
             meNu = "Latte";
        }
        else if(a==3){
            meNu = "Espresso";
        }
        else if(a==4){
            meNu = "Mocha";
        }
        else{
            meNu ="Invalid Menu";
        }
        return meNu;
    }
}
