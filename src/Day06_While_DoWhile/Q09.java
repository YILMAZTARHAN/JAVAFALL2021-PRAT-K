package Day06_While_DoWhile;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
	//  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yaz�n�z.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Pin code giriniz:");
		int userPin=scan.nextInt();
		
		int systemPin=1453;
		
		while(userPin!=systemPin) {
			System.out.println("**** hatal� giri� yap�ld�****");
			System.out.println("**** aga bidaha dene****");
		    userPin=scan.nextInt(); 
		
		}
		
System.out.println("gayet ba�ar�l�");
	}

}
