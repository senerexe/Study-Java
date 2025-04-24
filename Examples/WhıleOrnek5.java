package a;

import java.util.Scanner;

public class WhıleOrnek5 {

	public static void main(String[] args) {
		// Harmonik sayıları
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Harmonik sayı giriniz :");
		double h = scan.nextDouble();
		double sonuc = 0;
		while(h>=1) {
			sonuc = sonuc + 1/h;
			h--;
		}
		System.out.println(sonuc);
	}

}
