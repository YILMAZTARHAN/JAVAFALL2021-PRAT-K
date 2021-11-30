package Day_03_StringManipulation_Sorular;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
     // Kullanýcýdan alacaðýmýz  3 kelimeden oluþan ismi
     // Örn. Ahmet Emin Yýlmaz-> A.E.Y formatýyla yazdýrýnýz.
    	
    Scanner scan=new Scanner(System.in);
    System.out.println("adýnýzý soyadýnýzý giriniz");
    String adSoyad=scan.nextLine();
    
     char ilkHarf=adSoyad.toUpperCase().charAt(0);
     char ikinciHarf=adSoyad.toUpperCase().charAt(adSoyad.indexOf(" ")+1);
     char ücüncüHarf=adSoyad.toUpperCase().charAt(adSoyad.lastIndexOf(" ")+1);
     
     System.out.println("Ýsminizin baþ harfleri:"+ ilkHarf+"."+ikinciHarf+"."+ ücüncüHarf );
    
     scan.close();
    
    
    }       
}
