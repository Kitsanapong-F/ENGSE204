package LAB5.lab5p10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            String descComplex = input.nextLine();
            int hours = input.nextInt();
            double Fee = input.nextDouble();
            input.nextLine();
            String descSimple = input.nextLine();
            int hoursSimple = input.nextInt();

            ComplexTask c1 = new ComplexTask(descComplex, hours, Fee);
            SimpleTask s1 = new SimpleTask(descSimple, hoursSimple);

            ProjectTask p1[] = {c1 , s1};

            for(int i = 0; i<p1.length ; i++){
                System.out.println(p1[i].calculrateCost());
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Erorr" +e.getMessage());
        }
        input.close();
    }
}
