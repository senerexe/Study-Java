package c;

import java.util.Scanner;

public class EtkinlikSecme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SICAKLIK 30DAN BÜYÜKSE YÜZME
		// SICAKLIK 5-30 ARASI FUTBOL
		// SICAKLIK 5DEN KUCUKSE KAYAK
		
		Scanner scan = new Scanner(System.in);
		System.out.println("HAVA SICAKLIĞINI GİRİNİZ :");
		int sıcaklık;
		sıcaklık = scan.nextInt();
		
		if(sıcaklık >= 30) {
			System.out.println("YÜZME");
		}else if(sıcaklık <30 && sıcaklık >=5) {
			System.out.println("FUTBOL");
		}else {
			System.out.println("KAYAK");
		}
		
				

	}

}
