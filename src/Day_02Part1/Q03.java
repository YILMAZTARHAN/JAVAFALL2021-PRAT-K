package Day_02Part1;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy/100*boy/100)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu Giriniz:");
		double boy=scan.nextDouble();
		
		 System.out.print("Lütfen Kilonuzu Giriniz:");
		 double kilo=scan.nextDouble();
		 
		 double vki=kilo/(boy/100*boy/100);
		 
		 if (vki<=20) {
			System.out.println("oldukca zayifsiniz");
		}
		
		 else if (20<vki && vki<=25) {
			 System.out.println("Normal sinirlardasiniz");
		}
		
		 else if (25<vki && vki<=30) {
			 System.out.println("Sisman kategorisindesiniz");
		}
		
		 else if (30<vki ) {
			 System.out.println("Obez grubundasiniz.");
		
		 }
		
		 scan.close();
		
    }

}
