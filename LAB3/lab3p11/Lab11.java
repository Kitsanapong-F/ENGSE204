package LAB3.lab3p11;

import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        Setmode(num, input); //เรียกใช้เมธอด
        
        input.close();
    }
    
    private static void Setmode(int N,Scanner input){ //เมธอดเช็คโหมด
        for(int i = 0 ; i < N ; i++){
            String mode = input.next();

            if(mode.equals("SET_URL")){
                SET_URL(input);
            }
            else if(mode.equals("SET_MAX")){
                SET_MAX(input);
            }
            else if(mode.equals("SHOW")){
                SHOW(input);
            }
        }
    }
    
    private static void SET_URL(Scanner input){  //เมธอดคำสั่งURL
        String url = input.next();
        SystemConfig config = SystemConfig.getInstance();
        config.setServerUrl(url);
    }
    
    private static void SET_MAX(Scanner input){ //เมธอดคำสั่งmax
        int maxCount = input.nextInt();
        SystemConfig config = SystemConfig.getInstance();
        config.setMaxConnections(maxCount);
    }

    private static void SHOW(Scanner input){ //เมธอดคำสั่งshow
        SystemConfig config = SystemConfig.getInstance();
        System.out.println("URL: "+config.getServerUrl());
        System.out.println("MAX: "+config.getMaxConnections());
    }
}

class SystemConfig{

    private static SystemConfig instance;
    private String serverUrl;
    private int maxConnections;

    private SystemConfig(){
        this.serverUrl = "default.server.com";
        this.maxConnections = 10;
    }

    public static SystemConfig getInstance(){

        if(instance == null){
            instance = new SystemConfig();
            return instance;
        }
        return instance;
    }

    public String getServerUrl(){
        
        return serverUrl;
    }

    public void setServerUrl(String url){
        this.serverUrl = url;
    }

    public int getMaxConnections(){
        return maxConnections;
    }

    public void setMaxConnections(int count){  //เช็คจำนวน
        if(count>0){
            
            this.maxConnections = count;
           
            System.out.println("Max connections set.");
        }
        else if(count<=0){
            System.out.println("Invalid count.");
        }
    }   
}
