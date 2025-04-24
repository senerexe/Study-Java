package a;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı Giriniz :");
		int sayi = scan.nextInt();
		switch(sayi) {
		case 1:
			System.out.println("Sayı 1'e eşittir");
			break;
		case 2:
			System.out.println("sayı 2'e eşittir");
			break;
		case 3:
			System.out.println("sayı 3'e eşittir");
			break;
			default:
				System.out.println("geçersiz sayı girdiniz");
		}

	}

}
