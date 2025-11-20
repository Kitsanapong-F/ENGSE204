import java.util.Scanner;

public class lab3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        String num = add(number);
        System.out.println(num);
    }
    public static String add(int a) {
        String A;
        if(a % 2 == 0){
            A = "Even";
        } else {
            A = "Odd";
        }
        return A;
    }
}
