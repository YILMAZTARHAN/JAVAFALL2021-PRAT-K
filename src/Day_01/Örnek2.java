package Day_01;

import java.util.Scanner;

public class �rnek2 {

	public static void main(String[] args) {
		//Kullan�c�dan ad�n� soyad�n� ya��n� boyunu kilosunu al�p alt alta yaz�n�z
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Kullan�c�n�n Ad�n� Giriniz:");
		String Ad�=scan.nextLine();
		
		System.out.print("Kullan�c�n�n Soyad�n� Giriniz:");
		String soyad�=scan.nextLine();
		
		System.out.print("Kullan�c�n�n ya��n� Giriniz:");
		int yas=scan.nextInt();
		
		System.out.print("Kullan�c�n�n Boyunu Giriniz:");
		Double boy=scan.nextDouble();
		
		System.out.print("Kullan�c�n�n Kilosunu Giriniz:");
		int kilo=scan.nextInt();
		
		System.out.println("Ad�:"+Ad�+"\n"
		+"Soyad�:"+soyad�+"\n"
		+"Ya��n�z"+yas+"\n"
		+"Boyunuz:"+boy+"cm"+"\n"
		+"Kilonuz:"+kilo+"kg");
    
	}

}
