package Day_03_StringManipulation_Sorular;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
     // Kullan�c�dan alaca��m�z  3 kelimeden olu�an ismi
     // �rn. Ahmet Emin Y�lmaz-> A.E.Y format�yla yazd�r�n�z.
    	
    Scanner scan=new Scanner(System.in);
    System.out.println("ad�n�z� soyad�n�z� giriniz");
    String adSoyad=scan.nextLine();
    
     char ilkHarf=adSoyad.toUpperCase().charAt(0);
     char ikinciHarf=adSoyad.toUpperCase().charAt(adSoyad.indexOf(" ")+1);
     char �c�nc�Harf=adSoyad.toUpperCase().charAt(adSoyad.lastIndexOf(" ")+1);
     
     System.out.println("�sminizin ba� harfleri:"+ ilkHarf+"."+ikinciHarf+"."+ �c�nc�Harf );
    
     scan.close();
    
    
    }       
}
