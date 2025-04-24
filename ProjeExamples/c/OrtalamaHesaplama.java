package c;

import java.util.Scanner;

public class OrtalamaHesaplama {

	public static void main(String[] args) {
		int[] notlar = new int[4];
		int toplam = 0 ;
		Scanner scan = new Scanner(System.in);
		System.out.println("LÜTFEN NOTLARINIZI GİRİNİZ");
		System.out.print("MATEMATİK : ");
		notlar[0] = scan.nextInt();
		System.out.print("KİMYA :");
		notlar[1] = scan.nextInt();
		System.out.print("FİZİK :");
		notlar[2] = scan.nextInt();
		System.out.print("TÜRKÇE :");
		notlar[3] = scan.nextInt();
		
		for( int not : notlar ) {
			toplam += not;
		}
		System.out.println("ORTALAMANIZ :" + (toplam / notlar.length));
	}

}
