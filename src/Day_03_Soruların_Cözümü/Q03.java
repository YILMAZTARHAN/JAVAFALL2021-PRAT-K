package Day_03_Sorular�n_C�z�m�;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen Adınızı ve soyadınızı giriniz = "); //Ahmet Emin Yilmaz
        String adAd2Soyad = oku.nextLine();


        /*Ahmet Emin Yılmaz
         A : adAd2Soyad.CharAt(0);
         E : 1.boşluk karakterinin indexinin 1 fazlası
         Y : Son boşluğun indexinin 1 fazlası */

        //en kısa kod:
        System.out.println(adAd2Soyad.charAt(0) + "." + adAd2Soyad.charAt(adAd2Soyad.indexOf(" ") + 1) + "." + adAd2Soyad.charAt(adAd2Soyad.lastIndexOf(" ") + 1) + ".");
        //A.E.Y.

        //1. yöntem:
        char adIlkHarf = adAd2Soyad.charAt(0);
        char ad2IlkHarf = adAd2Soyad.charAt(adAd2Soyad.indexOf(" ") + 1);
        char soyadIlkHarf = adAd2Soyad.charAt(adAd2Soyad.lastIndexOf(" ") + 1);

        // 2.Yöntem:
        int ilkBoslukIndex = adAd2Soyad.indexOf(" ");
        int sonBoslukIndex = adAd2Soyad.lastIndexOf(" ");

        ad2IlkHarf = adAd2Soyad.charAt(ilkBoslukIndex + 1);
        soyadIlkHarf = adAd2Soyad.charAt(sonBoslukIndex + 1);
        /*****************************************************/
        System.out.println(adIlkHarf + "." + ad2IlkHarf + "." + soyadIlkHarf + ".");     //A.E.Y.
    }
}
