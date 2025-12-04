package LAB1;
import java.util.Scanner;
public class lab14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int R = input.nextInt();
        int C = input.nextInt();
        
        char[][] map = new char[R][C];
        
        for(int i = 0;i<R;i++){
            for(int j = 0;j<C;j++){
                map[i][j] = input.next().charAt(0);
            }
        }
        
        char tarGet = '*';
        char sPace = '.';
        int tarGetR = input.nextInt();
        int tarGetC= input.nextInt();
        
        int numBerbombs = countMine(map, tarGetR, tarGetC, R,C, tarGet);
        
        if(tarGetR>R||tarGetC>C){
            System.out.printf("%d",numBerbombs); // เช็คว่าตกขอบหรือไม่
        }
        
        else if( map[tarGetR][tarGetC] == tarGet){ // เช็คว่าโดนระเบิดหรือไม่
            System.err.println("Mine");
        }
        
        else if(map[tarGetR][tarGetC] == sPace){ // เช็คว่ากดช่องว่างหรือไม่
            System.out.printf("%d",numBerbombs);
        }
        input.close();
    }
    
    public static int countMine(char map[][], int tarGetR,int tarGetC,int R,int C,char tarGet){
        int count = 0; 
        
        for(int i = 0;i<R;i++){
            
            for(int j = 0;j<C;j++){
                
                if(map[i][j] == tarGet){  // เช็คจำนวนtarGet
                    
                    count = count+1; 

                }
            }
        }
        return count;
    }

}
