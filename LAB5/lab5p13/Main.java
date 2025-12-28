package LAB5.lab5p13;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String nameDev = input.nextLine();
    int projectsDev = input.nextInt();
    input.nextLine();
    String nameAdmin = input.nextLine();
    int projectsAdmin = input.nextInt();
    input.nextLine();
    String adminKey = input.nextLine();

    User u1 = new User("Guest");
    Developer d1 = new Developer(nameDev, projectsDev);
    Admin a1 = new Admin(nameAdmin, projectsAdmin, adminKey);

    User[] u = {u1,d1,a1};

    int totolClearance = 0;

    for(int i = 0;i<u.length;i++){
        totolClearance += u[i].getClearanceLeve();
    }

    for(int i = 0;i<u.length;i++){
        if(u[i] instanceof Admin ){
            Admin admin = (Admin) u[i];
            System.out.println(admin.getAdminkey());
        }
    }
    System.out.println(totolClearance);
   } 
}
