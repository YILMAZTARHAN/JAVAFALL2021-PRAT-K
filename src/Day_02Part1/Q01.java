package Day_02Part1;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("L�tfen iki say� giriniz:");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("Toplama icin->1 \n��karma icin->2 \n�arpma icin->3 \nB�lme icin->4");
				
		int islem=scan.nextInt();
		
		if (islem==1) {
			System.out.println("Girdi�iniz Say�lar�n Toplam�:"+(sayi1+sayi2));
		}
		else if (islem==2) {
			System.out.println("Girdi�iniz Say�lar�n Fark�:"+(sayi1-sayi2));
		}
		
		else if (islem==3) {
			System.out.println("Girdi�iniz Say�lar�n �Arp�m�:"+(sayi1*sayi2));
		}
		else if (islem==4) {
				System.out.println("Girdi�iniz Say�lar�n B�l�m�:"+(sayi1/sayi2));	
			
			
		}
		else {
			System.out.println("agam hatali giris yaptin !!!");
		}
		
		
		scan.close();
			
	}

}
