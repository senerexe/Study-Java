package c;

import java.util.Scanner;

public class AtmProje {

	public static void main(String[] args) {
		
		int bakiye = 1000, miktar,input;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("BANKAYA HOŞGELDİNİZ, YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ, GÜNCEL BAKİYENİZ :" + bakiye);
		while(bakiye>0) {
			
			System.out.println();
			System.out.println("1- PARA YATIR");
			System.out.println("2-PARA ÇEKME");
			System.out.println("3- BAKİYE SORGULAMA");
			System.out.println("4- ÇIKIŞ YAPMA");
			input= scan.nextInt();
			
			if(input==1) {
				System.out.println("YATIRMAK İSTEDİĞİNİZ MİKTARI GİRİNİZ");
				miktar = scan.nextInt();
				bakiye += miktar;
			}else if(input ==2) {
				System.out.println("ÇEKMEK İSTEDİĞİNİZ MİKTARI GİRİNİZ");
				miktar = scan.nextInt();
				if(miktar>bakiye) {
					System.out.println("YETERSİZ BAKİYE");
				}else {
					
				bakiye -= miktar;
				} 
			}else if(input==3) {
				
				System.out.println("GÜNCEL  BAKİYENİZ : " + bakiye);
			}else if(input==4) {
				System.out.println("çıkış yapılıyor");
				break;
		}
			
		

		}

}
}

