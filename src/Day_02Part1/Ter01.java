package Day_02Part1;

import java.util.Scanner;

public class Ter01 {

    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Sayý Giriniz:");
    	int sayi=scan.nextInt();
    	
    	
    	System.out.println("****** Ternary çözüm");
    	
    	String result=(sayi>=0)?((sayi<10)?("rakam"):("Pozitif Sayi")):("Negetif Sayý");
    	System.out.println(result);
    	
    	System.out.println("******** if çözüm");
    	
    	if (sayi>=0) {
			if (sayi<10) {
				System.out.println("Rakam");
			}
				else {
					System.out.println("Pozitif Sayý");
				}
			}
    	else {
			System.out.println("Negetif Sayý");
		}
    	
    	
    	
    	scan.close();
    	
    	
    	
    	
    }
}
