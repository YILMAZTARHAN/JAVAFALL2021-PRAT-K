package Day07_Arrays;

public class Q07 {

    public static void main(String[] args) {
    	/*
         * 2 boyutlu bir diziyi kabul eden ve maksimum de�eri bulan bir y�ntem yaz�n
         * (2 boyutlu bir diziyi kabul eden ve maksimum de�er bulan bir method yazin )
         * Giri� : {{1,2,-3},{41,55},{-61,-17,80}}
         * ��k�� : 8
         */
    	 int arr[][] = {{1, 2, -3}, {41, 55}, {-61, -17, 80}};
         System.out.println( maxDegerBul(arr));
     }
     private static int maxDegerBul(int[][] arr) {
         int max =arr[0][0];
         for (int kat = 1;  kat < arr.length; kat++) {
             for (int daire = 0; daire <arr[kat].length; daire++){
                 if (arr[kat][daire]>max){
                     max=arr[kat][daire];
                 }
             }
         }
         return max;
     }
 }
 












