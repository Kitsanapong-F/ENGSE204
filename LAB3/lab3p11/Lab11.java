package LAB3.lab3p11;

import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for(int i = 0 ; i < N ; i++){
            String mode = input.next();

            if(mode.equals("SET_URL")){
                String url = input.next();

                SystemConfig config = SystemConfig.getInstance();

                config.setServerUrl(url);
            }
            else if(mode.equals("SET_MAX")){
                int maxCount = input.nextInt();

                SystemConfig config = SystemConfig.getInstance();

                config.setMaxConnections(maxCount);
            }
            else if(mode.equals("SHOW")){
                SystemConfig config = SystemConfig.getInstance();

                System.out.println("URL: "+config.getServerUrl());
                System.out.println("MAX: "+config.getMaxConnections());

            }
        }
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

    public void setMaxConnections(int count){
        if(count>0){
            
            this.maxConnections = count;
           
            System.out.println("Max connections set.");
        }
        else if(count<=0){
            System.out.println("Invalid count.");
        }
    }   
}
