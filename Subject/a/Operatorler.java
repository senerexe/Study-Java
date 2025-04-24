package a;

public class Operatorler {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		int toplam = a + b;
		int cıkarma = a - b;
		int carpma = a * b;
		int bolme = a / b;
		int mod = a % b;
		
		System.out.println("TOPLAM : " + toplam);
		System.out.println("ÇIKARMA : " + cıkarma);
		System.out.println("ÇARPMA : " + carpma);
		System.out.println("BÖLME : " + bolme);
		System.out.println("MOD : " + mod);
		
		toplam++;
		System.out.println(toplam);
		cıkarma--;
		System.out.println(cıkarma);
		
		int sonuc = a++ + b--;
		System.out.println(sonuc);
		System.out.println(a);
		System.out.println(b);
		
		int sayı1 = 10;
		int sayı2 = 5;
		
		sayı1 -= 2;
		System.out.println(sayı1);
		sayı1 *= 3;
		System.out.println(sayı1);
		sayı1 /= 4;
		System.out.println(sayı1);
		
		boolean kosul = (sayı1 / sayı2 ) == 2;
		System.out.println(kosul);
		
		boolean kosul1 = sayı1 > sayı2;
		boolean kosul2 = sayı2 > sayı1;
		boolean sonuc2 = kosul1 && kosul2; // ve
		System.out.println(sonuc2);

		boolean sonuc3 = kosul1 || kosul2; // veya
		System.out.println(sonuc3);
		
		String sonuc4 = (a==b) ? "Doğru" : "Yanlış";
			System.out.println(sonuc4);
		
			sayı1=sayı2;
			System.out.println(sayı1);
			
			sayı1 += 2;
			System.out.println(sayı1);
		
		
		
		

	}

}
