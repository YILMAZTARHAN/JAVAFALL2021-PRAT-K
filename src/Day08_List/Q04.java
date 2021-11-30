package Day08_List;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Bir öðretmenden girmek istediði kadar notu alýnýz, ve
        // ortalamayý geçen öðrenci sayýsýný bulunuz.
    	
    	
        List<Integer> listNotlar = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String dewamkee;
        //ortalamasi alinacak iist elemanlri kullanicidan alindi
        do {
            System.out.print("not giriniz : ");
            int ogrNot= scan.nextInt();
            System.out.println("dewamkeee : E/H");
            dewamkee= scan.next();
            listNotlar.add(ogrNot);
        }while (dewamkee.equalsIgnoreCase("E"));

        //ortlama hesaplanmasi..
        int toplam=0;
        for (int i = 0; i <listNotlar.size(); i++){
        	
            toplam+=listNotlar.get(i);
        }
        double ortalama=toplam/listNotlar.size();
        
        //ortlamayi geçen ogr sayisi

        
        int ortlamaGecenSayisi=0;
        for (int i = 0; i < listNotlar.size(); i++) {
            if (listNotlar.get(i)>ortalama){
                ortlamaGecenSayisi++;
            }
            
        }
        System.out.println("girilen notlarin ortaqlamasi  :"+ortalama);
        System.out.println("ortalama gecen ogr sayisi : "+ortlamaGecenSayisi);
    }
}