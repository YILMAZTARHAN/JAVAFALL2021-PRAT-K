package Day05_ForLoop;

import java.util.Scanner;

public class Q10 {
	  public static void main(String[] args) {
		  /*Kullan�c�dan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf oldu�unu,
		    de�ilse sessiz harf oldu�unu ekrana yazd�rs�n. Girdi�i de�er harf de�ilse yada
		            1 karakterden fazla ise hata mesaj� g�stersin. (Test girilen harfi b�y�k yada k���kl���ne duyarl�d�r.)

		    Sesli harfler: a,e,i,o,u

		    Test Data:
		    a

		    Beklenen ��kt�:
		    a harfi sesli harfdir.

		    Test Data:
		    d

		    Beklenen ��kt�:
		    d harfi sesiz harftir.

		    Test Data:
		    we  yada %

		    Beklenen ��kt�:
		    Yanlis karakter girdiniz!

		     */
		  Scanner scan = new Scanner(System.in);
		  System.out.print("Harf giriniz : ");
		  String girilenHarf=scan.nextLine();
		  String sesliHarfler="aeiuoAEIUO";
		  String sessizHarfler="bcdfghjklmnprstvyzxwqBCDFGHJKLMNPRSTVYZXWQ";
		  
		  /*if (girilenHarf.length()==1) {// tek harf kontrol� yap�ld�.
			
		
		  
		 for (int i = 0; i < sesliHarfler.length(); i++) {
			if (girilenHarf.charAt(0)==sesliHarfler.charAt(i)) {
				System.out.println("Gerieln Harf seslidir");
				break;
			} else if(girilenHarf.charAt(0)==sessizHarfler.charAt(i)) {
				System.out.println("Gerieln Harf sessizdir");
				break;
			}
			else {
				System.out.println("AGAM nidding yanl�� karakter girding:-)a");
			     break;
			}
		     
       
		  }  
		     
		  } */   
		  
    }
}

