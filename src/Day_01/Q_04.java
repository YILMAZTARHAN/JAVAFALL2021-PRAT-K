package Day_01;

import java.util.Scanner;

public class Q_04 {

	public static void main(String[] args) {
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("1.Sayýyý Giriniz:");
		
		int sayi1=scan.nextInt();
		
         System.out.print("2.Sayýyý Giriniz:");
		
		int sayi2=scan.nextInt();
		
		System.out.println("Girilen Sayýlarýn Toplamýný Yazýnýz:"+(sayi1+sayi2));
		System.out.println("Girilen Sayýlarýn Toplamýný Yazýnýz:"+(sayi1-sayi2));
		System.out.println("Girilen Sayýlarýn Toplamýný Yazýnýz:"+(sayi1*sayi2));
		System.out.println("Girilen Sayýlarýn Toplamýný Yazýnýz:"+(sayi1/sayi2));
		
		
		
		
		
	}

}
