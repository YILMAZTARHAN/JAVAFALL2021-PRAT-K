package Day_03_Sorular�n_C�z�m�;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
       kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir email giriniz");
        String email = scan.next();

        if(email.contains("hotmail")){
            email = email.replace("hotmail", "gmail");
        }
        System.out.println(email);

        scan.close();
    }
}
