package Day06_While_DoWhile;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		 //Bir top belirli y�kseklikten at�lmaktad�r.
	    // At�ld�ktan sonra, at�ld��� y�ksekli�in 3/4 u kadar yerden yukar� do�ru z�plamaktad�r
	    // Top z�plama  y�ksekli�i 1 metrenin alt�na indi�inde durmaktad�r.
	    // Bu ana kadar aldigi toplam yolu ve yere vurma say�s�n� bulunuz.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("topun b�rak�ld��� ilk y�kseklikli�i giriniz:");
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
		System.out.println("topun ald��� toplam yol:"+topunToplamYolu);
		

	}

}
