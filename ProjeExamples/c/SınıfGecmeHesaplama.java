package c;

import java.util.Scanner;

public class SınıfGecmeHesaplama {

	public static void main(String[] args) {
		
		int turkce,matematik,kimya,fizik,bıyolojı;
		double ortalama=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Türkçe notunu giriniz :");
		turkce = scan.nextInt();
		System.out.print("Matematik notunu giriniz :");
		matematik = scan.nextInt();
		System.out.print("Kimya notunu giriniz :");
		kimya = scan.nextInt();
		System.out.print("Fizik notunu giriniz :");
		fizik = scan.nextInt();
		System.out.print("Biyoloji notunu giriniz :");
		bıyolojı = scan.nextInt();
		
		ortalama = (turkce + matematik + kimya + fizik + bıyolojı) / 5;
		if(ortalama<50) {
			System.out.println("Sınıfı geçemediniz");
		} else {
			System.out.println("Sınıfı geçtiniz");
		}
		System.out.println("Ortalamanız :" + ortalama);
	}

}

