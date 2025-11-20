import java.util.Scanner; // import
public class lab2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//สร้างscanner
        double width = input.nextDouble();
        double height = input.nextDouble();
        System.out.println(width*height);
        input.close();
    }
}
