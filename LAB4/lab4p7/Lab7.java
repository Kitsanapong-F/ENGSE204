package LAB4.lab4p7;

import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String id1 = input.nextLine();
        String id2 = input.nextLine();
        String id3 = input.nextLine();

        Resource r1 = new Resource(id1);
        Resource r2 = new Resource(id2);
        Resource r3 = new Resource(id3);

        r1 = null; //กำหนดเป็นค่าว่าง
        r2 = null;

        System.gc(); //เรียกใช้gc

        r3 = null;

        System.gc();

        input.close();
    }
}

class Resource{

    private String id;

    public Resource(String id){

        this.id = id;
        System.out.println("Resource"+id+"created");
    
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Resource"+id+"finalized (destroyed)");
        super.finalize();
    }
}