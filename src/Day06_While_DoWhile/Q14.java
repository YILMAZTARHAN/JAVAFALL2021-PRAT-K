package Day06_While_DoWhile;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
	    /*  Problem Tan�m�
        Verilen bir say�n�n fakt�riyelini �zyineli (recursive) olarak
        hespalayan fonksiyonu yaz�n�z.
        �rnek Ekran ��kt�lar�
        Bir sayi giriniz: 6
        Fakt�riyeli: 720
        Bir say� giriniz: 3
        Fakt�riyeli 6
     */
	
		Scanner scan=new Scanner(System.in);
		System.out.println("bir say� giriniz:");
		int sayi=scan.nextInt();
		int fakt�riyel=1;
		while (sayi>0) {
			fakt�riyel*=sayi;
			sayi--;
			
			
		}System.out.println("Fakt�riyel: " +fakt�riyel);
	
	
	
	
	
	
	}

}
