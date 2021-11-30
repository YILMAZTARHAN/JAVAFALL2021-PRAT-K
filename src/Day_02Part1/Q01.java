package Day_02Part1;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lütfen iki sayý giriniz:");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("Toplama icin->1 \nçýkarma icin->2 \nÇarpma icin->3 \nBölme icin->4");
				
		int islem=scan.nextInt();
		
		if (islem==1) {
			System.out.println("Girdiðiniz Sayýlarýn Toplamý:"+(sayi1+sayi2));
		}
		else if (islem==2) {
			System.out.println("Girdiðiniz Sayýlarýn Farký:"+(sayi1-sayi2));
		}
		
		else if (islem==3) {
			System.out.println("Girdiðiniz Sayýlarýn ÇArpýmý:"+(sayi1*sayi2));
		}
		else if (islem==4) {
				System.out.println("Girdiðiniz Sayýlarýn Bölümü:"+(sayi1/sayi2));	
			
			
		}
		else {
			System.out.println("agam hatali giris yaptin !!!");
		}
		
		
		scan.close();
			
	}

}
