package Day_01;

import java.util.Scanner;

public class Q_04 {

	public static void main(String[] args) {
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("1.Say�y� Giriniz:");
		
		int sayi1=scan.nextInt();
		
         System.out.print("2.Say�y� Giriniz:");
		
		int sayi2=scan.nextInt();
		
		System.out.println("Girilen Say�lar�n Toplam�n� Yaz�n�z:"+(sayi1+sayi2));
		System.out.println("Girilen Say�lar�n Toplam�n� Yaz�n�z:"+(sayi1-sayi2));
		System.out.println("Girilen Say�lar�n Toplam�n� Yaz�n�z:"+(sayi1*sayi2));
		System.out.println("Girilen Say�lar�n Toplam�n� Yaz�n�z:"+(sayi1/sayi2));
		
		
		
		
		
	}

}
