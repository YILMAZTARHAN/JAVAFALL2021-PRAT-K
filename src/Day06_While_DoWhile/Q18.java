package Day06_While_DoWhile;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		 //TODO STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yaz�n�z.
		

		Scanner scan=new Scanner(System.in);
		
		
		String systemPin="Javacanlara selam olsun";
		int girisHakki=3;
		while(true) {
			System.out.println("Pin code giriniz:");
			String userPin=scan.nextLine();
			if (userPin.equals(systemPin)) {
				System.out.println("gayet ba�ar�l�");
				break;
				
			}else {
				System.out.println("Hatal� Giri� yap�ld�");
				girisHakki--;
				System.out.println("kalan deneme hakk�n�z: "+girisHakki);
				 if (girisHakki == 0) {
	                    System.out.println("agam hakkin kalmadi bekleme yapma dewamkeee :)");
	                    break;
	                }
			
			
			
			
			
			
			}
			
			
			
			
		}
		
		
		
	}

}
