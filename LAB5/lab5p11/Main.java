package LAB5.lab5p11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            
            String titleDoc1 = input.nextLine();
            int wordCount1 = input.nextInt();
            input.nextLine();
            String titlePdf1 = input.nextLine();
            int pageCount1 = input.nextInt();
            input.nextLine();
            String titleDoc2 = input.nextLine();
            int wordCount2 = input.nextInt();
            input.nextLine();
            String titlePdf2 = input.nextLine();
            int pageCount2 = input.nextInt();

            int totolPages = 0;
            TextDocument TextDocument1 = new TextDocument(titleDoc1, wordCount1);
            PDFDocument   PDFDocument1 = new PDFDocument(titlePdf1,  pageCount1);
            TextDocument TextDocument2 = new TextDocument(titleDoc2, wordCount2);
            PDFDocument   PDFDocument2 = new PDFDocument(titlePdf2,  pageCount2);

            Document[] documents = {TextDocument1,PDFDocument1,TextDocument2,PDFDocument2};

            for(int i = 0;i<documents.length;i++){
                if(documents[i] instanceof PDFDocument){
                    PDFDocument pdf = (PDFDocument) documents[i];
                    totolPages += pdf.pageCount;
                }
            }
            
            for(int i = 0;i<documents.length;i++){
                documents[i].displayDetails();
            }

            System.out.println("Total Pages: "+totolPages);
        }
        catch(IllegalArgumentException e){
            System.out.println("Erorr "+e.getMessage());
        }

        input.close();
        
    }
}
