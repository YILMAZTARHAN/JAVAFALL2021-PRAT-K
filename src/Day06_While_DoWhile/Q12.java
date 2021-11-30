package Day06_While_DoWhile;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		 //Bir top belirli yükseklikten atýlmaktadýr.
	    // Atýldýktan sonra, atýldýðý yüksekliðin 3/4 u kadar yerden yukarý doðru zýplamaktadýr
	    // Top zýplama  yüksekliði 1 metrenin altýna indiðinde durmaktadýr.
	    // Bu ana kadar aldigi toplam yolu ve yere vurma sayýsýný bulunuz.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("topun býrakýldýðý ilk yükseklikliði giriniz:");
		double yukseklik=scan.nextDouble();
		double topunToplamYolu=0;
		int yerevurmaSayisi=0;
		
		do {
			yerevurmaSayisi++;
			topunToplamYolu+=yukseklik;
			yukseklik*=(0.75);
			topunToplamYolu+=yukseklik;
			
		} 
		while(yukseklik>=1);
		System.out.println("topun vura sayisi:"+yerevurmaSayisi);
		System.out.println("topun aldýðý toplam yol:"+topunToplamYolu);
		

	}

}
