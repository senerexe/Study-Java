package a;

import java.util.Scanner;

public class WhıleOrnek2 {

	public static void main(String[] args) {
		/* NEGATİF BİR DEĞER GİRİLENE KADAR KULLANICIDAN GİRİŞLERİ KABUL EDEN VE GİRİLEN 
		    DEĞERLERDEN TEK SAYILARI TOPLAYAN PROGRAM */
		
		int toplam = 0;
		int input;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Lütfen bir değer giriniz :");
			input = scan.nextInt();
			
			if(input < 0) {
				System.out.println("Negatif sayı girdiğiniz için program durdu");
				System.out.println("Tek sayılar toplamı :" + toplam);
				break;
			}
			if(input % 2 == 1) {
				toplam = toplam + input;
			
			}
		
		}


	}

}
