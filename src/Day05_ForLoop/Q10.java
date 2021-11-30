package Day05_ForLoop;

import java.util.Scanner;

public class Q10 {
	  public static void main(String[] args) {
		  /*Kullanýcýdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduðunu,
		    deðilse sessiz harf olduðunu ekrana yazdýrsýn. Girdiði deðer harf deðilse yada
		            1 karakterden fazla ise hata mesajý göstersin. (Test girilen harfi büyük yada küçüklüðüne duyarlýdýr.)

		    Sesli harfler: a,e,i,o,u

		    Test Data:
		    a

		    Beklenen Çýktý:
		    a harfi sesli harfdir.

		    Test Data:
		    d

		    Beklenen Çýktý:
		    d harfi sesiz harftir.

		    Test Data:
		    we  yada %

		    Beklenen Çýktý:
		    Yanlis karakter girdiniz!

		     */
		  Scanner scan = new Scanner(System.in);
		  System.out.print("Harf giriniz : ");
		  String girilenHarf=scan.nextLine();
		  String sesliHarfler="aeiuoAEIUO";
		  String sessizHarfler="bcdfghjklmnprstvyzxwqBCDFGHJKLMNPRSTVYZXWQ";
		  
		  /*if (girilenHarf.length()==1) {// tek harf kontrolü yapýldý.
			
		
		  
		 for (int i = 0; i < sesliHarfler.length(); i++) {
			if (girilenHarf.charAt(0)==sesliHarfler.charAt(i)) {
				System.out.println("Gerieln Harf seslidir");
				break;
			} else if(girilenHarf.charAt(0)==sessizHarfler.charAt(i)) {
				System.out.println("Gerieln Harf sessizdir");
				break;
			}
			else {
				System.out.println("AGAM nidding yanlýþ karakter girding:-)a");
			     break;
			}
		     
       
		  }  
		     
		  } */   
		  
    }
}

