package c;

import java.util.Scanner;

public class KdvHesaplama {

	public static void main(String[] args) {
		
		double fiyat , kdvliFiyat , kdv = 0.18;
		
		Scanner input = new Scanner(System.in);
		System.out.println("ÜRÜNÜN FİYATINI GİRİNİZ :");
		fiyat = input.nextDouble();
		kdvliFiyat = fiyat + (fiyat*0.18); 
		System.out.println("KDVLİ FİYATI :" + kdvliFiyat);
		
	}

}
