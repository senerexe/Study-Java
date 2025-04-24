package a;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		// BREAK = DÖNGÜYÜ DURDURUR
		// CONTİNUE = DÖNGÜYÜ DURDURMAZ AMA BİR SONRAKİ ADIMA GİDER
		
		Scanner scan = new Scanner(System.in);
		int sayi;
		while(true) {
			System.out.println("sayı giriniz");
			sayi = scan.nextInt();
			if(sayi == 0) {
				System.out.println("döngü bitti");
				break;
			}
				System.out.println(sayi);
		
		
		
		
	}

}
}