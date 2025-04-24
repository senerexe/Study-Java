package a;

import java.util.Scanner;

public class WhıleOrnek4 {

	public static void main(String[] args) {
		// FAKTÖRİYEL HESAPLAMA
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Faktöriyeli alınacak sayı :");
		int f;
		f = scan.nextInt();
		int i = 0;
		int sonuc = 1;
		while(i<f) {
			sonuc *= f;
			f--;
			
		}
		System.out.println(sonuc);
		

	}

}
