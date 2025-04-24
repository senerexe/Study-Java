package a;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String k_adi,parola;
		System.out.print("Kullanıcı aının giriniz :");
		k_adi = scan.nextLine();
		System.out.print("Parola giriniz :");
		parola = scan.nextLine();

		if((k_adi.equals("java")) && (parola.equals("123"))) {
			System.out.println("Giriş başarılı");
		}else {
			System.out.println("Giriş başarısız");

		}

	}

}


