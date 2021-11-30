package Day06_While_DoWhile;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
	    /*  Problem Tanýmý
        Verilen bir sayýnýn faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazýnýz.
        Örnek Ekran Çýktýlarý
        Bir sayi giriniz: 6
        Faktöriyeli: 720
        Bir sayý giriniz: 3
        Faktöriyeli 6
     */
	
		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayý giriniz:");
		int sayi=scan.nextInt();
		int faktöriyel=1;
		while (sayi>0) {
			faktöriyel*=sayi;
			sayi--;
			
			
		}System.out.println("Faktöriyel: " +faktöriyel);
	
	
	
	
	
	
	}

}
