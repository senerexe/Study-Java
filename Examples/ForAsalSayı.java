package c;

import java.util.Scanner;

public class ForAsalSayı {

	public static void main(String[] args) {
		// ASAL SAYI
		
		Scanner scan = new Scanner(System.in);
		int input;
		boolean asal = true;
		
		do {
			System.out.print("LÜTFEN SAYI GİRİNİZ :");
			input = scan.nextInt();
		
	}while(input<2);
		
		for(int i = 2 ; i < input ; i++) {
			if(input % i ==0) {
				asal = false;
				break;
			}
				
			}
		if(asal)
		{
			System.out.println("GİRİLEN SAYI ASAL ");
		} else {
			System.out.println("GİRİLEN SAYI ASL DEĞİL");
		}
}
}