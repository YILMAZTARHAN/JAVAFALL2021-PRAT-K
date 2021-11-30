package Day07_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
	
	public static void main(String[] args) {
		// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
		// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
		// java programi yazin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("arryinzin boyutunu giriniz");
		int arrBoyutu=scan.nextInt();
		
		int arr[]=new int[arrBoyutu];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Arrayin "+(i+1) + ".elemanýný giriniz");
			arr[i]=scan.nextInt();
			
		}
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("girdiðiniz arrayin max-min eleman deðeri :"+(arr[arrBoyutu-1]-arr[0]));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
