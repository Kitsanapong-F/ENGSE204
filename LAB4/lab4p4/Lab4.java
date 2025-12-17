package LAB4.lab4p4;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double latitude = input.nextDouble();
        double longitude = input.nextDouble();
        double newlat = input.nextDouble();

        Location loc1 = new Location(latitude, longitude);
        Location loc2 = new Location(loc1);
        
        loc1.setLatitude(newlat);
        loc1.displayinfo();
        loc2.displayinfo();
    }
}

class Location{

    private double latitude;
    private double longitude;

    public Location(double latitude,double longitude){

        this.latitude = latitude;
        this.longitude = longitude;

    }

    public Location(Location other){
        this.latitude = other.latitude;
        this.longitude = other.longitude;
    }

    public void setLatitude(double newlat){
        this.latitude = newlat;
    }

    public void displayinfo(){
        System.out.println("Lat:"+latitude+"Lon"+longitude);
    }
}