package Day_01;

import java.util.Scanner;

public class Örnek2 {

	public static void main(String[] args) {
		//Kullanýcýdan adýný soyadýný yaþýný boyunu kilosunu alýp alt alta yazýnýz
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Kullanýcýnýn Adýný Giriniz:");
		String Adý=scan.nextLine();
		
		System.out.print("Kullanýcýnýn Soyadýný Giriniz:");
		String soyadý=scan.nextLine();
		
		System.out.print("Kullanýcýnýn yaþýný Giriniz:");
		int yas=scan.nextInt();
		
		System.out.print("Kullanýcýnýn Boyunu Giriniz:");
		Double boy=scan.nextDouble();
		
		System.out.print("Kullanýcýnýn Kilosunu Giriniz:");
		int kilo=scan.nextInt();
		
		System.out.println("Adý:"+Adý+"\n"
		+"Soyadý:"+soyadý+"\n"
		+"Yaþýnýz"+yas+"\n"
		+"Boyunuz:"+boy+"cm"+"\n"
		+"Kilonuz:"+kilo+"kg");
    
	}

}
