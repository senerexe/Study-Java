package b;

public class StringSinifi {

	public static void main(String[] args) {

		// str.length() : GİRİLEN KARAKTERİN SAYISINI DÖNDÜRÜR
		// str1.concat(str2) : STRİNG BİRLEŞTİRME
		// str.indexOf('K') : KARAKTERİN KONUMUNU VERİR
		// str.charAt(5) : KONUMU VERİLEN KARAKTERİ OKUR
		//str.compareTo("Kodlama") : BÜYÜK/KÜÇÜK FAK DUYARLI OLARAK KARŞILAŞTIRIR
		//str.compareToIgnoreCase("KODlama") : BÜYÜK KÜÇÜK HARF DUYARLI OLMADAN KARŞILAŞTIRIR
		//str.contains("kod") : GİRİLEN DEĞER STRİNG İÇİNDE GEÇİYORMU DİYE KONTROL EDER
		//str.endsWith("a") : BELİRTİLEN KARAKTER(LER) İLE BİTİYORSA TRUE DEĞERİNİ DÖNDÜRÜR
		//str.replace("Kodlama" , "Vakti") : STRİNG DEĞİŞTİRME İÇİN KULLANILIR
		//str.toLoweCase() : BÜYÜK YAZAR
		// str.toUpperCase() : KÜÇÜK YAZAR
	
		// char[] str = { 'K','O','D','L','A','M','A'}
		// String metin = new String(str);
		// System.out.println(metin);
	
		String metin = "KODLAMA";
		String metin2 = "JAVA";
		System.out.println(metin.length());
		System.out.println(metin + metin2);
		System.out.println(metin.concat(metin));
		System.out.println(metin.indexOf('L'));
		System.out.println(metin.charAt(0));
		System.out.println(metin.contains("LAMA"));
	

	
	}

}
