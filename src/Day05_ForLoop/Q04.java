package Day05_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
    	// Kullan�c�dan 5 adet say� isteyiniz
        // Bu say�lardan 5 ile 10 aras�ndakiler hari�, di�erlerinin toplam�n� bulunuz.
        // bu soruyu continue kullanarak ��z�n�z.


    	Scanner scan=new Scanner(System.in);
    
    	
    	int toplam=0;
    	
    	
    	for (int i = 1; i <=5; i++) {
			System.out.println("sayi "+i+" giriniz: ");
			int sayi=scan.nextInt();
			
			if (sayi>5  && sayi<10) {
				System.out.print("Girilen say� 5 ile 10 aras� old i�lemem al�nmad�");
			     continue;// ticari bekleme devam et komutudur.....yok saymak pas ge� gibi bir�ey
			}
			toplam+=sayi;
		
    	}
    	System.out.println("Girdi�iniz Say�lar�n Toplam�:"+ toplam);
    }

}
