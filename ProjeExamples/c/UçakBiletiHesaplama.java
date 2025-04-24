package c;

import java.util.Scanner;

public class UçakBiletiHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Km birim fiyatı : 0.20$
		// 8 yaşından küçükse toplam fiyata %35 indirim
		// 18 ve 24 yaş arasındaysa % 25 indirim
		// 65 yaşından büyükse %99 indirim
		// Gidiş dönüş alırsa % 28 indirim
		
		Scanner scan = new Scanner(System.in);
		int km , yas , tip;
		System.out.print("LÜTFEN KİLOMETREYİ GİRİNİZ :");
		km = scan.nextInt();
		System.out.print("LÜTFEN YAŞINIZI GİRİNİZ :");
		yas = scan.nextInt();
		System.out.print("LÜTFEN TİP SEÇİMİNİZİ GİRİNİZ :");
		tip = scan.nextInt();
		
		double normalFiyat,yasİndirimi = 0,tipİndirimi;
		
		if(km>0 && yas>0 && (tip==1 || tip==2 )) {
			normalFiyat= km * 0.20;
			if(yas<8) {
				yasİndirimi = normalFiyat * 0.35; //İNDİRİM ORANI HESAPLAMA
			}else if(yas>=18 &&  yas<=24) {
				yasİndirimi = normalFiyat * 0.25;
			}else if(yas>65) {
				yasİndirimi = normalFiyat * 0.99;
			}else { 
				yasİndirimi= 0;		
		    }
			normalFiyat -= yasİndirimi; // FİYATTAN İNDİRİM PAYINI ÇIKARMA
			if(tip == 2) {
				tipİndirimi = normalFiyat * 0.20;
				normalFiyat = (normalFiyat - tipİndirimi) * 2;
			}
			System.out.println("Bilet Tutarı : " + normalFiyat + "$");
					
	     }else {
			System.out.println("GİRDİĞİNİZ DEĞERLER EKSİK VEYA YANLIŞ LÜTFEN TEKRAR GİRİNİZ ");
		}
	}
}
		
				
	


