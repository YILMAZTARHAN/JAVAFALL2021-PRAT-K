package Day_03_Sorular�n_C�z�m�;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Lutfen adinizi ve soyadinizi giriniz = ");
        String adSoyad = oku.nextLine();

        // Ahmet Yılmaz    substring(başlangıç index, e kadar - dahil değil)


        String ad = adSoyad.substring(0, adSoyad.indexOf(" "));
        String Soyad = adSoyad.substring(adSoyad.indexOf(" ")+ 1);

        System.out.println("ad = " + ad);       //ad = kader
        System.out.println("Soyad = " + Soyad); //Soyad = Esen
    }
}
