package b;

import c.HesapMakinesi;

public class Sınıflar {

	public static void main(String[] args) {
		// Object Oriented Programming
		// SınıfAdı objeAdı = new SınıfAdı();
		// Constructor(Yapıcı)
		
		HesapMakinesi m1 = new HesapMakinesi(10,5, "siyah");
		System.out.println(m1.toplam());
		m1.sayi1 = 8; 
		System.out.println(m1.cikarma());
		
		HesapMakinesi m2 = new HesapMakinesi(20,3,"mavi");
		System.out.println(m2.toplam());
	

		
	}

}
