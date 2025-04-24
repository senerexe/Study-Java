package a;

import java.util.Scanner;

public class WhıleOrnek7 {

	public static void main(String[] args) {
		// ÜSLÜ SAYI HESAPLAMA
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ÜSSÜ ALINACAL SAYI :");
		int sayı1 = scan.nextInt();
		System.out.print("ÜS OLACAK SAYI :");
		int sayı2 = scan.nextInt();
		int sonuc = 1;
		while(0<sayı2) {
			sonuc = sonuc * sayı1;
			sayı2--;
		}
		System.out.println(sonuc);
	}

}
