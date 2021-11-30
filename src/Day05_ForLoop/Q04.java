package Day05_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
    	// Kullanýcýdan 5 adet sayý isteyiniz
        // Bu sayýlardan 5 ile 10 arasýndakiler hariç, diðerlerinin toplamýný bulunuz.
        // bu soruyu continue kullanarak çözünüz.


    	Scanner scan=new Scanner(System.in);
    
    	
    	int toplam=0;
    	
    	
    	for (int i = 1; i <=5; i++) {
			System.out.println("sayi "+i+" giriniz: ");
			int sayi=scan.nextInt();
			
			if (sayi>5  && sayi<10) {
				System.out.print("Girilen sayý 5 ile 10 arasý old iþlemem alýnmadý");
			     continue;// ticari bekleme devam et komutudur.....yok saymak pas geç gibi birþey
			}
			toplam+=sayi;
		
    	}
    	System.out.println("Girdiðiniz Sayýlarýn Toplamý:"+ toplam);
    }

}
