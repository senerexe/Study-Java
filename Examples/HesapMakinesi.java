package a;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sayi1,sayi2,secim;
		System.out.println("ilk sayıyı giriniz:");
		sayi1 = scan.nextInt();
		System.out.println("ikinci sayıyı giriniz");
		sayi2 = scan.nextInt();
		System.out.println("yapmak istediğiniz işlemi seçin ");
		System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
		secim = scan.nextInt();

		if(secim == 1) {
			System.out.println("toplama : " + (sayi1 + sayi2));
		}else if(secim == 2) {
			System.out.println("çıkarma : " + (sayi1 - sayi2));
		}else if(secim == 3) {
			System.out.println("çarpma : " + (sayi1*sayi2));
		}else if(secim == 4) {
			if(sayi2 == 0) {
				System.out.println("ikinci sayı 0'a eşittir ve sonuç belirsizdir");
			} else {
				System.out.println("bölme : " + (sayi1 / sayi2));
			}
	    } else {
				System.out.println("geçersiz sayı girdiniz");
			}



		

	}

	}
