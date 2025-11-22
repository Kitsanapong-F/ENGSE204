package LAB;
import java.util.Scanner; // import Scanner
public class lab6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // สร้างScanner
        int numBer = input.nextInt(); 
        for(int i = 1 ;i<=12;i++){
            System.out.printf("%d x %d = %d\n",numBer,i,(numBer*i));  //แสดงค่าแม่สูตรคูณ
        }
        input.close(); // ปิดScanner
    }
}

