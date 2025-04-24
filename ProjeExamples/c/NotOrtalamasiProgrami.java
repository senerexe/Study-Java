package a;

import java.util.Scanner;

public class NotOrtalamasiProgrami {

	public static void main(String[] args) {
		int quiz , vize , ffinal;
		double ortalama;
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("QUİZ NOTUNU GİRİNİZ");
		quiz = input.nextInt();
		System.out.println("VİZE NOTUNU GİRİNİZ");
		vize = input.nextInt();
		System.out.println("FFİNAL NOTUNU GİRİNİZ");
		ffinal = input.nextInt();
		
		ortalama = (quiz * 0.2) + (vize * 0.35) + (ffinal * 0.45);
		System.out.println("NOT ORTALAMANIZ :" + ortalama);
		String sonuc = (ortalama > 50) ? "GEÇTİNİZ" : "KALDINIZ";
		System.out.println(sonuc);
	}

}
