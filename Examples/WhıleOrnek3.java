package a;

import java.util.Scanner;

public class WhıleOrnek3 {

	public static void main(String[] args) {
		// Girilen sayıya kadar olan 2nin kuvvetleri
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı giriniz :");
		int input = scan.nextInt();
		int k = 1;
		while(k<=input) {
			System.out.println(k);
			k = k*2;
			
		}

	}

}
