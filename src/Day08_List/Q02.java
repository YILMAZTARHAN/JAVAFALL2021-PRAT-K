package Day08_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q02 {

    public static void main(String[] args) {
    	 //2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki t�m elemanlar� bir
        //listeye kopyalayan ve harf s�ras�na g�re yazd�ran bir METHOD yaz�n�z.
        //Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
        //   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
    	
    	String isim[][] = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};
        yeniList(isim);
    }

    
    public static void yeniList(String[][] isim) {
        List<String> list1 = new ArrayList<>();
        
        for (int kat = 0; kat < isim.length; kat++) {//kat kontrolu
            for (int daire = 0; daire < isim[kat].length; daire++) {//dire kontrolu
                list1.add(isim[kat][daire]);//girilen karin dairesi list  eklendi
            }
            
        }
        System.out.println("ilk liste :" + list1);
        Collections.sort(list1);
        System.out.println("siralamadan sonraki liste :" + list1);
    }
}














