package c;

import java.util.Scanner;

public class DaireAlanHacimHesaplama {

	public static void main(String[] args) {
		
		int r;
		double alan,hacim,pi = 3.14;
		
		Scanner input = new Scanner(System.in);
		System.out.println("YARIÇAPI GİRİNİZ");
		r = input.nextInt();
		alan = 2*pi*r;
		hacim=pi*(r*r);
		System.out.println("DAİRENİN ALANI :" + alan);
		System.out.println("DAİRENİN HACMİ :" + hacim);
	}

}
