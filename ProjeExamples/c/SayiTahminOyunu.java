package c;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

	public static void main(String[] args) {
		int tahmin;
		int can=5;

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("HOŞGELDİNİZ LÜTFEN 0-99 ARASI BİR SAYI GİRİNİZ");
		int sayi = rand.nextInt(100);
		boolean oyundurumu = false;
		System.out.println(sayi);

		while(can > 0) {
			tahmin = scan.nextInt();
			if( tahmin < 0 || tahmin > 99) {
				System.out.println("GEÇERSİZ ARALIKTA DEĞER GİRDİNİZ LÜTFEN TEKRAR DENEYİNİZ");
				continue;
			}
			if(tahmin == sayi) {
				oyundurumu = true;
				break;
			}else {
				System.out.println("LÜTFEN TEKRAR DENEYİNİZ! KALAN CANINIZ : " +  --can);
			}
		}
		if(oyundurumu) {
			System.out.println("TEBRİKLER KAZANDINIZ !");
		}else {
			System.out.println("BAŞARAMADINIZ'");
		}

	}

}
