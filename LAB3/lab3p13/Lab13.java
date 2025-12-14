package LAB3.lab3p13;

import java.util.Scanner;

public class Lab13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        input.nextLine();
        for(int i = 0;i < N;i++){

            String mode = input.next();

            if(mode.equals("SET")){
                
                int quota  = input.nextInt();

                LicenseManager.setMax(quota);
            }
            else if(mode.equals("CHECKOUT")){
                LicenseManager.checkOut();
            }
            else if(mode.equals("CHECKIN")){
                LicenseManager.checkIn();
            }
            else if(mode.equals("STATUS")){
                LicenseManager.displayStatus();
            }
        }
        input.close();
    }
}

class LicenseManager{

    private static int maxLicenser = 10;
    private static int usedLicenses = 0;

    public static void setMax(int max){

        if(max<0){
            System.out.println("Invalid max value.");
        }
        else if(max<usedLicenses){
            System.out.println("Cannot set max lower than current usage");
        }
        
        maxLicenser = max;

        System.out.println("Max licenses set to "+max);
    }

    public static boolean checkOut(){

        if(usedLicenses < maxLicenser){
            
            usedLicenses ++;

            System.out.println("Checkout successful");

            return true;
        }
        else if(usedLicenses >= maxLicenser){
            System.out.println("Checkout failed: No licenses available.");

            return false;
        }
        
        return false;

    }

    public static void checkIn(){ //เมธอดเช็คค่า
        
        if(usedLicenses > 0){
            usedLicenses--;

            System.out.println("Check-in successful.");
        }
        else if(usedLicenses == 0){
            System.out.println("Nothing to check-in.");
        }
    }

    public static void displayStatus(){ //เมธอดแสดงค่า

        System.out.println("Used: "+usedLicenses);
        System.out.println("Available: "+(maxLicenser-usedLicenses));

    }
}
